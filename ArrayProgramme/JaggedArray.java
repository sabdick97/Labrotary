package oops;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][]=new int[3][];
		Scanner sc= new Scanner (System.in) ;
		arr[0]= new int [3];
		arr[1]= new int [4];
		arr[2]= new int [2];
		
		//INITIALIZING JAGGED ARRAY
		//int count=1;
		System.out.println("Enter the jagged elements of");
		for (int i=0; i<arr.length;i++)
		{
			for (int j=0; j<arr[i].length; i++)
			{
				arr[i][j]=sc.nextInt();
				//arr[i][j]=count++;
			}
		}
		
		//PRINTING JAGGED ARRAY
		System.out.println("Jagged Array");
		for (int i=0; i<arr.length;i++)
		{
			for (int j=0; j<arr[i].length; i++)
			{
				System.out.println(arr[i][j]+ " ");
			}
			System.out.println();
		}
}
	}
