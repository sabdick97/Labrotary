package Practice;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter any number");
	
               int num= sc.nextInt();
               int sq= num*num;
               int sum=0;
               while(sq>0)
               {
            	   int mod = sq%10;
            	   sum= sum+mod;
            	   sq= sq/10;
            	   
               }
               if (sum==num)
               {
            	   System.out.println("Neon number :" + num);
            	   
               }
               else
               {
            	   System.out.println("not Neon Number :" + num);
               }
	}

}
