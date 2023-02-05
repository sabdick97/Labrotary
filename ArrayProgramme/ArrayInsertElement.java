package Arrayexamples;

import java.util.Scanner;

public class ArrayInsertElement {

	public static void main(String[] args) {
		int size,loc,i,item;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Array Size");
		size=sc.nextInt();
		
		int a[]= new int [size+1];
		System.out.println("Enter Array Elements");
		for (i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter where put new data");
		loc=sc.nextInt();
		System.out.println("Enter new Data");
		item=sc.nextInt();
		
		for(i=size;i>loc;i--)
		{
			a[i]=a[i-1];
		}
		a[loc]=item;
		size++;
		System.out.println("Print All Element");
		for (i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
