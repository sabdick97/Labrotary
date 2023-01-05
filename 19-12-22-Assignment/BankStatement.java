package basic;
import java.util.*;

public class BankStatement {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int bal,ch,with,bal1,depo,bal2;
		System.out.println("Welcome to bank management system");
		System.out.println("enter your opening balance");
		bal=s1.nextInt();
		System.out.println("1.withdrawl 2.Deposit");
		System.out.println("enter your choice(1/2)");
		ch=s1.nextInt();
		switch(ch) {
		case 1:
			Scanner s2=new Scanner(System.in);
			System.out.println("enter your withdrawl amount");
			with=s2.nextInt();
			if (with<=bal)
			{bal1=bal-with;
			System.out.println("remaining balance:"+bal1);
			}
			else
				System.out.println("Insufficient balance");
			
			break;
		case 2:
			Scanner s3=new Scanner(System.in);
			System.out.println("enter your deposit amount");
			depo=s3.nextInt();
			bal2=bal+depo;
			System.out.println("remaining balance:"+bal2);
			break;
			default:
				
				System.out.println("wrong choices");
		
		}
		
		
				
		
	}

}
