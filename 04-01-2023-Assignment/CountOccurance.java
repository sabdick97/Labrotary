//WAP to count the no. of occurance of a character
public class CountOccurance {

	public static int countOcc(String str, char c)
	{
		int count=0;
		for (int i=0;i<str.length();i++)
		{
			if (c==str.charAt(i))
			{
				count++;
			}
			
			
		}
		
		return count;
	}

	
	
	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a String");
 String str = sc.nextLine().toLowerCase();
 System.out.println("Enter which occurance to find:");
 char c= sc.next().charAt(0);
 System.out.println("No of occurance of "+c+"  is : "+countOcc(str,c));
 
		
 
	}

}
