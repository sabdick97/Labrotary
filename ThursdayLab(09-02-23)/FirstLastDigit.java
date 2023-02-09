package thrsdayJob;

import java.util.Scanner;

//WAP to find the first and last digit of a number
public class FirstLastDigit {

	public static void main(String[] args) {
		int num, first_dig=0,last_dig=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		num=sc.nextInt();
		temp=num;
		last_dig= num%10;
		
		{
			System.out.println("Last Digit of the Number  "+num+ "is :"+last_dig );
		}
		
		for(;num>=10;)
		{
			num=num/10;
			first_dig=num;
			System.out.println("First Digit of the Number "+ temp +" is :"+ first_dig);
		}

	}

}
