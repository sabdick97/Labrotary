package basic;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in); 
		System.out.println("enter a number");
		int i,n,result;
		n= sc.nextInt();
		for (i=1; i<=10; i++)
			
		{
			result=n*i;
			System.out.println(n+ " * "+ i+" ="+ result );	
		}
		
		

	}

}
