package ArrayExample;
// WAP delete any one of the number from Array
import java.util.Scanner;

public class DeleteArray2 {

	public static void main(String[] args) {
		int i,size,loc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		size=sc.nextInt();
		
		
		int a[]=new int[size];
		System.out.println("Enter Array Elements");
		for (i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			
		}
       System.out.println("Enter array location");
       loc=sc.nextInt();
       
       for (i=loc;i<size-1;i++)
       {
    	   a[i]=a[i+1];
    	   
       }
       size--;
   	for (i=0;i<size;i++)
   	{
   		System.out.println(a[i] +  "");
   	}
       
	}

}
