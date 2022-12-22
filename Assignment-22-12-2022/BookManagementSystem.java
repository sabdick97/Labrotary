package oops;

import java.util.Scanner;

class Library{
	String name,author,uni_id,status;
	
	int price;
	static String library= "Anudip House";
	public void displayByname() {
		
		System.out.println("book name "+ name);
	}
	
	public void createBook(String name,String author, String uni_id,String status,int price ) {
	
	this.name=name;
	this.author=author;
	this.uni_id=uni_id;
	this.status=status;
	this.price=price;
	this.status=status;
	}
	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("author: "+author);
		System.out.println("uni_id: "+uni_id);
		System.out.println("price: "+price);
		System.out.println("status: "+status);
		System.out.println("Library name: "+library);
		
	}
	
	public void borrow() {
		
		if (status.equals("available")||status.equals("Available"))
		{
			System.out.println("this book is available");
			}
			
			else
				System.out.println("this book is not available");
			}
		
	}
	
	

	
	
	


public class BookManagementSystem {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
	
			
Library library=new Library();
library.createBook("Feluda", "B.Banerjee", "AZ456yi", "Available",550);
library.displayByname();

Library library1 =new Library();
library1.createBook("Tintin", "Rowling", "ZA875yi", "Available",800);
library1.displayByname();

Library library2=new Library();
library2.createBook("GK", "Lucent","XS678yi", "Available",200);
library2.displayByname();

Library library3=new Library();
library3.createBook("physics", "Chand", "FD679yi", " Not Available", 500);
library3.displayByname();

Library library4=new Library();
library4.createBook("Chemistrey","Chaya Prakasani", "VG678yi", "Available", 1000);
library4.displayByname();

	
do {
	System.out.println("enter any digit");
	System.out.println("1) Book details");
	System.out.println("2) Borrow book");
	
	System.out.println("3) Exit");
	 int choice=sc.nextInt();
	
	switch(choice)	
	{
	case 1:
		System.out.println("1)"+ library.name + "2)"+library1.name +"3)"+library2.name + "4)"+ library3.name + "5)"+ library4.name);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			library.display();
			break;
		case 2:
			library1.display();
			break;
		case 3:
			library2.display();
			break;
		case 4:
			library3.display();
			break;
			
		case 5:
			library4.display();
			
			break;
		}
		break;
	case 2:
	System.out.println("which book do you want to borrow?");
	System.out.println("1)"+ library.name + "2)"+library1.name + "3)"+library2.name + "4)"+library3.name + "5)"+ library4.name);
	int ch1=sc.nextInt();
	switch(ch1) {
	
	case 1:
		library.borrow();
		break;
	case 2:
		library1.borrow();
		break;
	case 3:
		library2.borrow();
		break;
	case 4:
		library3.borrow();
		break;
		case 5:
			library4.borrow();
			break;
	
		
	}
		
	case 3:
		System.exit(0);
		
		break;
	
		default:
			System.out.println("invalid number");
		
	}
	
}while(true);

	
	
	
}
	}






	
