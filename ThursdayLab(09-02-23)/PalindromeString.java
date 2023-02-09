package thrsdayJob;

import java.util.Scanner;

//WAP to count number of palindrome words in a string
public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter Any String");
		Scanner sc=new Scanner (System.in);
		String str= sc.next();
		 String org_str= str;
		 String rev="";
		 int length= str.length();
		 
		 for(int i=length-1;i>=0;i--)
		 {
			 rev= rev+str.charAt(i);
		 }
		 if(org_str.equals(rev))
		 {
			 System.out.println(org_str+ " is a Palindrome String");
			 
		 }
		 else
		 {
			 System.out.println(org_str+ "is not a Palindrome String");
		 }
		 
		

	}

}
