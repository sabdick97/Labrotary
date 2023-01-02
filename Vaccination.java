package oops;

import java.util.Scanner;

abstract class Vaccination{
	
Scanner sc=new Scanner(System.in);
int age,price;
String name,citizen;
public void firstDose()
{
	
sc.nextLine();
System.out.println("Enter your Name");
name=sc.nextLine();
System.out.println("Enter your citizen");
citizen=sc.nextLine();
if (citizen.equalsIgnoreCase("Indian"))
{
System.out.println("Enter your age");	
age=sc.nextInt();
if (age>=18)
{
	
System.out.println("Enter thr price");
price =sc.nextInt();
if (price ==250)
{
System.out.println("First dose is succesfully done");	
}
else
{
System.out.println("the amount to be paid");	

}

}
else {
System.out.println("Age must be 18");	

}
}
else 
{	
System.out.println("Vaccination only for India Citizen");
}
}


public void secondDose() {
	
System.out.println("First dose done: Y/N");
char c=sc.next().charAt(0);
if ((c=='Y') || (c=='y')) {
	
	sc.nextLine();
	System.out.println("Enter your Name");
	name=sc.nextLine();
	System.out.println("Enter your age");
	age=sc.nextInt();
	System.out.println("Enter your citizen");
	citizen=sc.nextLine();
	if (citizen.equalsIgnoreCase("Indian"))
	{
	System.out.println("Enter your age");	
	age=sc.nextInt();
	if (age>=18)
	{
		
	System.out.println("Enter thr price");
	price =sc.nextInt();
	if (price ==250)
	{
	System.out.println("Second dose is succesfully done");	
	}
	else
	{
	System.out.println("the amount to be paid");	

	}

	}
	else {
	System.out.println("please come after 60 days");
	}
	
	}
	else 
	{	
	System.out.println("Please recieve the first dose and come again");	
	
	}
	}
}
 abstract  public void Booster();
}
class VaccinationBooster extends Vaccination {
	public void Booster() {

 System.out.println("First dose done: Y/N");
 char c=sc.next().charAt(0);
 if ((c=='Y') || (c=='y')) {
 	
 	System.out.println("Has it been 60 days from your second dose vaccine? y/n");
 	c= sc.next().charAt(0);
 	if ((c=='Y') || (c=='y'))
 			{
 		System.out.println("Booster dose done succesfully");
 		
 			}

 	else
 	{
 		System.out.println("Please complete 60 days at first then come");
 	
 	}
 }
 else {
	 System.out.println("Please recieve first dose and second dose then come for Booster Dose");
 }

}
}












public class VaccinationPortal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VaccinationBooster vac= new VaccinationBooster();
	
 do
 {
	 System.out.println("Welcome to Vaccination Centre\n");
	 System.out.println("1)First Dose\n2)Second Dose\n3)Booster Dose\n4)Exit\n");
	 System.out.println("Choose any one");
	 int choice = sc.nextInt();
	 
	 switch(choice)
	 {
	 case 1:
		 vac.firstDose();
		 break;
	 case 2:
		 vac.secondDose();
	 case 3:
		 vac.Booster();
		 
	 case 4:
		 System.out.println("Exit from Vaccination E-centre..................!");
		 
		 System.exit(0);
		 
		
	 
	 
	 
	 }
	 
	 
	 
	 
	 
 
 
	}while(true);
	


}
}
