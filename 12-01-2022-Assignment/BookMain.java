package batchapplication;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		int choice,ch;
		Scanner sc= new Scanner(System.in);
		BookService book= new BookService();
		System.out.println("Welcome to Anudip Foundation");
		do {
			System.out.println("Please choose which course you want to choose:\n "+"1)JAVA 2)AWS 3)Others 4)Exit ");
			
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("----JAVA----");
				System.out.println("1)Enter student info\n 2)show student info\n"+"3)Upadate student info");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					book.javaStudentInfo();
					System.out.println();
					break;
					
				case 2:
					book.getJavaStudentDetails();
					System.out.println();
					break;
				case 3:
					
					break;
					
				case 4:
					
					break;
					
				default:
					System.out.println("Wrong Choice");
				
				
				
				}
			case 2:
				System.out.println("----AWS----");	
				System.out.println("1)Enter student info\n 2)show student info\n"+"3)Upadate student info");
				ch=sc.nextInt();
				switch(ch) {
				
				case 1:
					book.awsStudentInfo();
					System.out.println();
					break;
					
				case 2:
					book.getAwsStudentDetails();
					System.out.println();
					break;
				case 3:
				book.updateAwsStudentInfo();
				System.out.println();
				break;
				case 4:
					
					break;
					
					default:
						System.out.println("Wrong Choice");
				
				
				
				}
				
			case 3:
				book.searchCourse();
				break;
			case 4:
				System.exit(0);
				
				
				
			}
					
			
		}while(true);

	}

}
