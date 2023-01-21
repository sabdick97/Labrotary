package oops;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		int a[]= new int[5]; int min;int max;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter array elememnts");
		for ( int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		min=a[0];
		for (int i=1;i<a.length;i++)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
				
		}
		
		System.out.println("Minimum value is: " + min);
	}

	
