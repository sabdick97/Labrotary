package basic;

import java.util.Scanner;

public class First_lastDigit {

	public static void main(String[] args) {
		int number,first_digit=0,last_digit=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter anumber");
		number= sc.nextInt();
		temp= number;
		last_digit= number%10;
		System.out.println("the last digit of " + number+ "is :"+last_digit);

				
	
	for (;number>=10;)
	{
		number= number/10;
		first_digit=number;
		System.out.println("the first_digit of " + temp+ "is :" +first_digit);

	}
		
	}
}
