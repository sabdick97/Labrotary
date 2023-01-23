package Practice;

import java.util.Scanner;

public class PalindromeLoop {

	public static void main(String[] args) {
		int a,c,r,s=0;
		System.out.println("Enter any Number");
		Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        c=a;
        while (a>0)
        	{
        	r=a%10;
        	s=(s*10)+r;
        	a=a/10;
        	}
        if (c==s)
        
        System.out.println("Palindrome Number");	
        
        else
        
        	System.out.println("Not Palindrome Number");
        	
}
}
