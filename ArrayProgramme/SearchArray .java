package Arrayexamples;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		int a[]= new int[5]; int n; int count=0;
		Scanner sc= new Scanner (System.in);
		System.out.println(("Enter Array Elements"));
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Printing Array Elements");

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nSearch Array Elements");
		
		n=sc.nextInt();
		for(int i=0;i<a.length;i++)
			if (n==a[i])
			{
				
				count++;
			}
		if (count>0)
		{
			System.out.println("Item Found " + count+ " times");
		}
		else
		{
			System.out.println("Item Not Found");
		}
	}

}
