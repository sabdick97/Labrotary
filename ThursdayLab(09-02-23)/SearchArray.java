package thrsdayJob;

import java.util.Scanner;

//WAP to search an element in an array
public class SearchArray {

	public static void main(String[] args) {
		
		int a[]=new int[5]; int n; int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Printing Array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Search Array Elements");
		n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
		if(n==a[i])
		{
			count++;
		}
		}
		if(count>0)
		{
			System.out.println("Item found "+ count+ "times");
		}
		else
		{
			System.out.println("Item not found");
		}
	

}
}
