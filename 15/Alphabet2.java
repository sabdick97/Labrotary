package basic;

import java.util.Scanner;

public class Alphabet2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char c;
		System.out.println("enter a character");
		c= sc.next().charAt(0);
		if ((c=='a'|| c=='e' || c=='i'|| c=='o'|| c=='u')|| (c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U'))
		{
			System.out.println("the charecter is vowel");	
		}
		else
		{
			System.out.println("the charecter is consonent");
		}
	}

	
}
