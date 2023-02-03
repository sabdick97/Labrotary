public class TestingClass {
	public double addition(double a, double b)
	{
		return a+b;
	}
	
	public int addPositiveNumber(int a, int b)
	{
		return a+b;
	}
	
	public int addNegativeNumber(int a,int b)
	{
		return a+b;
	}
	
	public int substraction(int a,int b)
	{
		if(a>b)
			return a-b;
		else
			return b-a;
	}
	
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	
	public int factorial(int n)
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
		{
			fact *= i; //fact*i
		}
		return fact;
	}
	
	
	public void division(int a, int b)
	{
		int c = a/b;
		System.out.println(c);
	}
	
	public int findMax(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	
}


