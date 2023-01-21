package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		try(Scanner sc=new Scanner(System.in))//try with resource
		{
			try {
				int a,b;
				System.out.println("enter a value");
				a=sc.nextInt();
				System.out.println("enter 2nd value");
				b=sc.nextInt();
				System.out.println("Result: "+(a/b));
			}
				
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
			System.out.println("Rest of code:");
			int arr[]=new int[5];
			arr[5]=90;
			System.out.println("added value:" +arr[5]);
			
		}
        catch(ArrayIndexOutOfBoundException e)
		{
        	System.out.println("Exception occured : Index out of bounds");
        	
		}
		finally {
			System.out.println();
			//sc.close();//closing the scanner object
			System.out.println("Finally block always gets executed");
		
	}

}
}
