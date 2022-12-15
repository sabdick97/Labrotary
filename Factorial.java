package basic;

public class Factorial {

	public static void main(String[] args) {
		int count;
		int factorial=1;
		System.out.println( "Number Factorials");
		for (count=1; count<=10; count++)
		{
			factorial*=count;
			System.out.println("factorial of " + count + " is " + factorial);
			
		}
	}

}
