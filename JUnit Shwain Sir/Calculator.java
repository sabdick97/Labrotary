package co.junit;

public class Calculator {
	
	public int addition(int a, int b)
	{
		return(a+b);
	}
	public int Multiplication(int a, int b)
	{
		return a*b;
	}
	
	public int substraction(int a, int b)
	{
		return a-b;
	}
	
	public int division (int a, int b)
	{
		return a/b;
	}
	
	public int factorial(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		return f;
	}
}
