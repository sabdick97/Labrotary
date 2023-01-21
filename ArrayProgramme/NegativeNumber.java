package oops;

import java.util.Scanner;

public class NegativeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int s =sc.nextInt();
		int a[]=new int [s];
		System.out.println("Enter the elements");
		for (int i=0; i<s;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("Array");
		for (int i=0; i<s;i++)
		{
			System.out.println(a[i] + " ");
		}
		System.out.println(); 
		
		System.out.println("Negative numbers are :");
		for (int i=0; i<s;i++)
		{
			if (a[i]<0)
		
		{
		System.out.print( a[i]+  "  ") ;
	}

}
	}		
}
