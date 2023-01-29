package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Billing {
static ArrayList<Bill> list = new ArrayList<Bill>();
static Scanner sc =new Scanner(System.in);



static void order(String fname, int amt)
{
System.out.println("Enter the quantity for "+fname+" :" );
int qty=sc.nextInt();
list.add(new Bill(fname, qty, qty*amt));


}

static void cont()
{
	System.out.println("Do you want to continue: y/n");
	char ch= sc.next().charAt(0);
	if((ch!='y')&&(ch!='Y'))
	{
		System.out.println();
		//print total bill
		
		System.out.println("Do you have a coupon?");
		ch=sc.next().charAt(0);
		if(ch=='y')
		{
			coupon();
			
		}
		else 
		{
			totalbill();
		}
		
		System.exit(0);
		
	}

}

static void coupon()
{
   
		String coup1="12345";
		String coup2="NEW";
        sc.nextLine();
        System.out.println("Enter the coupon code");
        String code =sc.next();
        if((code.equals(coup1))||(code.equals(coup2)));
        {
        	System.out.println("BILL");
        	System.out.println("==================");
        	System.out.println( " ITEMS\t\tQTY\tAMOUNT");
        	System.out.println("==================================");
        	double total=0.0;
        	for(Bill i:list)
        	{
        		System.out.println(i.fname+"\t" +i.qty+"\t"+i.amt);
        		total= total+i.amt;
        	}
        	System.out.println();
        	System.out.println("Amount\tRs. "+total);
        	double gst=total*.05;
        	System.out.println("GST:\tRs." +gst);
        	System.out.println("==================");
        	double famount=gst+total;
        	System.out.println("Total:\tRs. "+famount);
        	double dist=famount*.1;
        	System.out.println("Discount: Rs."+dist);
        	System.out.println("Total after discount:Rs."+(famount-dist));
        	System.exit(0);
        
        
       
        {
        	System.out.println();
        	System.out.println("Amount\tRs. "+total);
        	double gst2=total*.05;
        	System.out.println("GST:\tRs." +gst2);
        	System.out.println("==================");
        	double famount2=gst+total;
        	System.out.println("Total:\tRs. "+famount2);
        	double dist2=famount*.2;
        	System.out.println("Discount: Rs."+dist2);
        	System.out.println("Total after discount:Rs."+(famount-dist2));
        	System.exit(0);
        }
}

}



static void totalbill()
{
	System.out.println("BILL");
	System.out.println("=========");
	System.out.println( "ITEMS\t\tQTY\tAMOUNT");
	System.out.println("=========================");
	double total =0.0;
	for (Bill i :list)
	{
		System.out.println(i.fname+"\t" +i.qty+"\t"+i.amt);
		total=total+i.amt;
		
	}

	System.out.println();
	System.out.println("Amount\tRs. "+total);
	double gst=total*.05;
	System.out.println("GST:\tRs." +gst);
	System.out.println("==================");
	double famount=gst+total;
	System.out.println("Total:\tRs. "+famount);
	
	System.exit(0);
	
	
	
	System.out.println("===============");
	
	

}	

}


