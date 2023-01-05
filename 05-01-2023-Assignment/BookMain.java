package Practice;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);	
	BookService bService= new BookService();
		do
		{
			
		System.out.println("Welcome to Book Management System");	
			System.out.println("1) Create Book Details\n"
			               +"2)Get Book Details Using Id\n"
					             +"3) Get All Book Details\n"
			                     +"4) Get Book Details By Name\n"
			                    +"5) Exit\n");
			System.out.println("============");
			System.out.println("Enter your Choice");
			int ch=sc.nextInt();
			 switch(ch)
			 {
			 case 1:
				 bService.createBook();
				 System.out.println();
				 break;
			 case 2:
				 bService.getBookDetailsUsingId();
				 System.out.println();
				 break;
				 
				 
			 case 3:
				 bService.getAllBookDetails();
				 System.out.println();
				 break;
				 
			 case 4:
				 bService.getBookDetailsByName();
				 System.out.println();
				 break;
				 
			 case 5:
				 System.out.println("Thanks for Visiting");
				 System.exit(0);
				 default:
					 System.out.println("Wrong Input");
				 
		
			 }
			 
			 
			 
		
		}while(true);

	}

}
