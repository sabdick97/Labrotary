package Practice;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,c,s=0,r;
		System.out.println("Enter any number ");
		a=sc.nextInt();
		c=a;
		while(a>0)
		{
           r=a%10;
           s=(r*r*r)+s;
           a=a/10;
		}
		if(c==s)
		{
			System.out.println("Amstrong Number");
		}
		else
		{
			System.out.println("not Amstrong Number");
		}
			
			
