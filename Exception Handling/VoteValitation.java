package ExceptionHandling;

import java.util.Scanner;

public class VoteValitation {

	static void voteEligibility(int v) throws AgeOutOfBoundException
	{
		if ((v>=18)||(v==18))
		{
			System.out.println(v + " is Eligible for vote");
		}
		else 
		{
			throw new AgeOutOfBoundException(v + " is not Eligible for vote");
		}
	}
	
	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Age");
      int age=sc.nextInt();
      try {
    	  voteEligibility(age);
      }
   catch (AgeOutOfBoundException e)
      {
	   System.out.println(e.getMessage());
      }
	}

}
