package thrsdayJob;

import java.util.Scanner;

//WAP to find the maximum and minimum number in an array
public class MaxMinArray {
	
	
	public static void main(String[] args) {
		
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	int max,min;
	System.out.println("Enter Array Elements");
	for (int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	max=a[0];
	min=a[0];
	for (int i=0;i<a.length;i++)

	{
		if(a[i]<min)
		{
			min=a[i];
		}
		 if (a[i]>max)
		 {
			 max=a[i];
		 }
		
		
	}
		
		System.out.println("Maximum number of an Array :"+max);
		System.out.println("Minimum number of an Array :"+min);
		
		
	}

}
