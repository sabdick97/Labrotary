package Arrayexamples;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int a[]=new int[5]; int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Printing Array Elements");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
		System.out.println("\nAddition of Array "+sum);

	}

}
