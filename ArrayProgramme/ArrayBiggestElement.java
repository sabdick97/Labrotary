package Arrayexamples;

import java.util.Scanner;

public class ArrayBiggestElement {

	public static void main(String[] args) {
		int a[]=new int[5]; int max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
        max=a[0];
    	for(int i=1;i<a.length;i++)
    	{
    		if(a[i]>max)
    		{
    			max=a[i];
    		}
    		
    	}
    	System.out.println("Maximum Element: "+max);
		
	}

}
