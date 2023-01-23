package Practice;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any character");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		System.out.println(ch);
	}
	

}
