package Multithreading;

public class DeadLockDemo {

	public static void main(String[] args) {
		final String resource1= "paper";
		final String resource2= "pen";
		
		Thread t1= new Thread() {
			public void run() {
				
				synchronized(resource1)
				{
					System.out.println("Thread1 locked resource1: paper");
					
					try {
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					synchronized(resource2)
					{
						System.out.println("Wanted to lock resource2: pen");
					}
					
			}
		}
		};
		
		Thread t2= new Thread() {
			public void run() {
				
				synchronized(resource2)
				{
					System.out.println("Thread2 locked resource1: paper");
					
					try {
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					synchronized(resource1)
					{
						System.out.println("Wanted to lock resource2: pen");
					}
				}
		
	}
	};
		t1.start();
		t2.start();
	}
	}

