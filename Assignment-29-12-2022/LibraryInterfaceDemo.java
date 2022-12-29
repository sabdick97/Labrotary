

package oops;



import java.util.Scanner;



interface LibraryUser{


	


	Scanner sc= new Scanner (System.in);


	void registerAccount();


	void requestBook();	


}



class KidsUser implements LibraryUser{


	int age;


	String bookType;	



	public void registerAccount(){


	//Scanner sc= new Scanner(System.in);	


	System.out.println("Enter your age");


	age=sc.nextInt();


	if (age<=12) {


		System.out.println("You have succesfully registered under a Kids Account");


	}


	else {


	System.out.println("Sorry, Age must be less than 12 to register as a kid");	


	}	


	


}



public void requestBook() {


	System.out.println("Enter your booktype :");


	bookType=sc.next();


if (bookType.equalsIgnoreCase("kids")) 


	


System.out.println("Book issued succesfully,please return the book within 10 days");	



else 


System.out.println("Oops, you are allowed to take only kids books");	


}


}





class Adultuser implements LibraryUser {



	@Override


	public void registerAccount() {


		System.out.println("Enter your age");


		int age = sc.nextInt();


		if (age>12) {


			System.out.println("You have succesfully registered under a Adult Account");


		}


		else {


		System.out.println("Sorry, Age must be greater than 12 to register as an adult");	


		}	


		


	}



	@Override


	public void requestBook() {


		System.out.println("Enter your booktype :");


		String bookType = sc.next();


	if (bookType.equalsIgnoreCase("fiction")) 


		


	System.out.println("Book issued succesfully,please return the book within 10 days");	



	else 


	System.out.println("Oops, you are allowed to take only adult fiction books");	


		


	}


	


	


	


	


	


	


}


	


	


	


	


	


public class LibraryInterfaceDemo {



	public static void main(String[] args) {


		// TODO Auto-generated method stub


		Scanner sc= new Scanner (System.in);


		KidsUser kids= new KidsUser();


		do


		{


			System.out.println("Welcome to Library System");


			System.out.println("which you want to choose:  \n1)kid\n2)Adult");


			


			int choice=sc.nextInt();


			switch(choice) {


			case 1:


				System.out.println("1)Register  2)Borrow");


				int ch=sc.nextInt();


				switch(ch) {


				case 1:


					kids.registerAccount();


					break;


				case 2:


					kids.requestBook();


					break;


				


				}


				break;


			case 2:


				System.out.println("1)Register  2)Borrow");


				int ch1=sc.nextInt();


				switch(ch1) {


				case 1:


				kids.registerAccount();	


				break;


				case 2:


					kids.requestBook();


					break;


				}


			break;


			


			}


			


			


			


			


		}while(true);


	



		}


		







	








}
