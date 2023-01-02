package Arrayexamples;
// WAP add or insert elements special position
import java.util.Scanner;

public class Deleteelements {

	public static void main(String[] args) {
		int ar[]= new int [20];
		Scanner sc=new Scanner(System.in);
				int i,num = 0,pos;
		System.out.println("How many elements do you want to enter :");
				int ele = sc.nextInt();
			System.out.println("Enter" + ele + "elements");
			for ( i=0;i<ele;i++)
			{
				ar[i]= sc.nextInt();
				
			}
      System.out.println("original array:");
      for ( i=0;i<ele;i++)
      {
    	 System.out.println(ar[i] + " "); 
      }
      
      System.out.println();
      System.out.println("Enter which position you want to insert : ");
      pos= sc.nextInt();
      if (pos>ele+1|| pos<0)
      {
    	  System.out.println("Invalid posititon");
    	 
      }
      else 
      {
    	  
      
      
      for (i=ele;i>pos;i--)
      {
    	  ar[i]=ar[i-1];
    	  
      }
      ar[pos-1]=num;
      ele++;
      System.out.println("Array after insertion");
      for (i=0;i<ele;i++)
      {
    	  System.out.println(ar[i] + "  ");
      }
	}
}	

}
