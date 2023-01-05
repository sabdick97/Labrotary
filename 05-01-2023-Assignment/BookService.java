package Practice;

import java.util.Scanner;

public class BookService {

	
		static Book book[]= new Book[10];
		static Scanner sc= new Scanner (System.in);
		static int index=0;
	     
		public static void createBook()
		{
			System.out.println("Enter Book Id");
			int id= sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter book name");
			String bname=sc.nextLine();
			
			System.out.println("Enter Authors Name");
			String author=sc.nextLine();
			
			System.out.println("Enter book Price");
			double price=sc.nextDouble();
			
			
			book[index]=new Book(id, bname, author, price);
			index++;
			System.out.println("Book details addeed!");
		}
		public  static void getAllBookDetails()
		{
			for (int i=0;i<index;i++)
			{
				
				System.out.println("Bool ID:" +book[i].getBookid());
				System.out.println("Book Nmae : "+ book[i].getBookName());
				System.out.println("Book Author Name :"+ book[i].getAuthor());
				System.out.println("Book Price:"+ book[i].getBookPrice());
				System.out.println("===================");
				
			}
			
			
			
		}
		public static void getBookDetailsByName()
		
		{
			boolean flag=false;
			sc.nextLine();
			System.out.println("Enter Book Name");
			String name= sc.nextLine();
			for (int i=0;i<index;i++)
			{
				if(name.equalsIgnoreCase(book[i].getBookName()))
				{
				System.out.println("Bool ID:" +book[i].getBookid());
				System.out.println("Book Nmae : "+ book[i].getBookName());
				System.out.println("Book Author Name :"+ book[i].getAuthor());
				System.out.println("Book Price:"+ book[i].getBookPrice());
				System.out.println("===================");
				flag=true;
				break;
				}
				
				
			}
			if (flag==false)
			{
				System.out.println("Invalid Name"); 
			}
		}
		
		public static void getBookDetailsUsingId()
		{
			boolean flag=false;
			System.out.println("Enter Book ID to search");
			int id = sc.nextInt();
			for (int i=0;i<index;i++)
			{
				if (id==book[i].getBookid())
				{
					
					System.out.println("Bool ID:" +book[i].getBookid());
					System.out.println("Book Nmae : "+ book[i].getBookName());
					System.out.println("Book Author Name :"+ book[i].getAuthor());
					System.out.println("Book Price:"+ book[i].getBookPrice());
					
					System.out.println("===================");
					flag=true;
					break;
				}
				
				
			}
			if (flag==false)
			{
				System.out.println("Book not found");
			}
		}

	

}
