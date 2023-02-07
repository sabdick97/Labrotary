package java8features;

interface runnable{
	
	void run();
}

public class LamdaEx {

	public static void main(String[] args) {
//		ArrayList<String> list= new ArrayList<String>();
//		list.add("Sabdick");
//		list.add("Pritam");
//		list.add("Rahul");
//
//		
//		//for each method is available from java 8
//		list.forEach((s)->System.out.println(s));
		
		// without lambda expression
		
		Runnable r1 =new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread1 is Running !");
				
			}
		};
			Thread t1= new Thread(r1);
			t1.start();
			
		
		// using lambda
			
			Runnable r2=()->
			{
				System.out.println("Thread2 is running !");
			};
			
			Thread t2= new Thread (r2);
			t2.start();
		
		
		
		
		
		
	}
	
	

}
