package Arrayexamples;

import java.util.Scanner;

public class DecendingArray {

	public static void main(String[] args) {
		int a[]=new int[5]; int temp=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Array Elements");
		
		for (int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=temp;
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
