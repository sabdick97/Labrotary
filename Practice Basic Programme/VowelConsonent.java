package Practice;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		// Find Vowel and Consonent
		char ch;
		System.out.println("enter any alphabet");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') { 
		
			
				System.out.println("the character is Vowel");	
			}
			
		else
			{
				System.out.println("the character is Consonent");	
			}	
				
			}
				
		}
		
	
