package Arrayexamples;

import java.util.Scanner;

public class RevereseArray {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	System.out.println("Printing Array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nReverse Array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
