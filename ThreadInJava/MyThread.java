package Multithreading;

public class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Thread is Running");
		
	}
	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();

	}

	
	}
