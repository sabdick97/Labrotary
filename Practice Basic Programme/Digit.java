package basic;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		int n,count=0;
		System.out.print("Enter any number");
		Scanner r=new Scanner(System.in);
	
		n=r.nextInt();
		
		while(n>0)
		{
			n=n/10;
			count++;
			
			
		}
		System.out.print("No. of Digits " + count);
	}
	

}
