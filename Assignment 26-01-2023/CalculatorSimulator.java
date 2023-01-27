package ExceptionHandling;

import java.util.Scanner;

public class CalculatorSimulator {

	public static void main(String[] args) {
		boolean isIndian;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String empName=sc.nextLine();
		System.out.println("Are you Indian? true(1) ?false(2) :");
		int c1=sc.nextInt();
		if(c1==1) {
			isIndian=true;	
		}
		else
		{
			isIndian=false;
		
		}
		
		System.out.println("your salary : ");
		double empSal=sc.nextDouble();
		TaxCalculator.calculateTax(empName, empSal, isIndian);
		sc.close();
		
	}
	}
