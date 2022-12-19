package basic;

import java.util.Scanner;

public class Calculator {

	
		public static int addition (int a, int b)
		{
			int result=a+b;
			return result;
				
		}
		
			public static int substraction (int a,int b) {
				
			int c;
			if(a>b) {
				c=a-b;
				
			}
			else {
				c=b-a;
			}
		
		return c;
			}
		public static float division (float a,float b) {
		float result=  (a/b);
			return result;
			
		}
		public static int multiplication (int a, int b) {
			int result= (a*b);
			return result;
		}
public static void main(String args[])
{
	int choice,num1,num2,res;
	float num3,num4,result;
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("which operation do you want to");
	System.out.println("1)Addition\n 2)Substraction\n 3)division\n4)Multiplication");
			choice=sc.nextInt();
	switch (choice)
	{
	case 1:
		System.out.println("enter first number");
		num1=sc.nextInt();
		System.out.println("enter second number");
		num2=sc.nextInt();
		res=Calculator.addition(num1,num2);
		System.out.println(num1+ "+"+ num2+ "="+ res);
		break;
	case 2:
		System.out.println("enter first number");
		num1=sc.nextInt();
		System.out.println("enter second number");
		num2=sc.nextInt();
		res=Calculator.substraction(num1, num2);
		System.out.println(num1+ "-"+ num2+ "="+ res);
		break;
	case 3:
		System.out.println("enter first number");
		num3=sc.nextFloat();
		System.out.println("enter second number");
		num4=sc.nextFloat();
		result=Calculator.division(num3,num4);
		System.out.println(num3+ "/"+ num4+ "="+ result);
		break;
	case 4:
		System.out.println("enter first number");
		num1=sc.nextInt();
		System.out.println("enter second number");
		num2=sc.nextInt();
		res=Calculator.multiplication(num1, num2);
		System.out.println(num1+ "*"+ num2+ "="+ res);
		break;
	}
	}
	while (choice!=5);
	
}


	}


