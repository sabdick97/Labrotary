package batchapplication;

import java.util.Scanner;

public class BookService {
static Scanner sc=new Scanner(System.in);
static Java java[]=new Java[20];
static int id;
static long phone;
static String name,email;
static int jindex=0;


static Aws aws[]=new Aws[20];
static int aindex=0;


public static void awsStudentInfo()
{
System.out.println("Enter Student ID: ");
id=sc.nextInt();

sc.nextLine();
System.out.println("Enter Student Name: ");
name=sc.nextLine();

System.out.println("Enter student email: ");
email=sc.nextLine();

System.out.println("Enter Student Phone No: ");
phone=sc.nextLong();



aws[aindex]= new Aws(id, name, phone, email);
aindex++;

System.out.println("Student Details added Succesfully!!");
}


public static void javaStudentInfo()
{

	System.out.println("Enter Student ID: ");
	id=sc.nextInt();

	sc.nextLine();
	System.out.println("Enter Student Name: ");
	name=sc.nextLine();

	System.out.println("Enter student email: ");
	email=sc.nextLine();

	System.out.println("Enter Student Phone No: ");
	phone=sc.nextLong();



	aws[aindex]= new Aws(id, name, phone, email);
	aindex++;
	System.out.println("Student details added succesfully!!");

}

public static void getAwsStudentDetails()
{
for (int i=0;i<aindex;i++)	
{
	System.out.println("Student ID: "+ aws[i].getStudentid());
     System.out.println("Student Name: "+ aws[i].getStdName());
     System.out.println("Student Email :"+ aws[i].getEmail());
     System.out.println("Student Phone No: "+ aws[i].getPhone());
     System.out.println("Course Name:AWS");
     System.out.println("=============================");
}
}
public static void updateJavaStudentInfo()
{
System.out.println("Enter Student Id; ");	
id=sc.nextInt();
for(int i=0;i<aindex;i++)
{
	
if(id==aws[i].getStudentid())
{
	System.out.println("Enter Student ID: ");
	id=sc.nextInt();

	System.out.println("Enter Student Name: ");
	name=sc.nextLine();

	System.out.println("Enter Student Phone No: ");
	phone=sc.nextLong();

	System.out.println("Enter student email: ");
	email=sc.nextLine();

	java[jindex]= new Java(id, name, phone, email);
	

	System.out.println("Student Details added Succesfully!!");
	
}

else
{
  throw new StudentNotFoundException("Student details not found");

}
}
}


//get java student details
public static void getJavaStudentDetails()
{
for (int i=0;i<jindex;i++)	
{
	System.out.println("Student ID: "+ java[i].getStudentid());
     System.out.println("Student Name: "+ java[i].getStdName());
     System.out.println("Student Email :"+ java[i].getEmail());
     System.out.println("Student Phone No: "+ java[i].getPhone());
     System.out.println("Course Name:JAVA");
     System.out.println("=============================");
}
}
public static void updateAwsStudentInfo()
{
System.out.println("Enter Student Id; ");	
id=sc.nextInt();
for(int i=0;i<jindex;i++)
{
	
if(id==java[i].getStudentid())
{
	System.out.println("Enter Student ID: ");
	id=sc.nextInt();

	System.out.println("Enter Student Name: ");
	name=sc.nextLine();

	System.out.println("Enter Student Phone No: ");
	phone=sc.nextLong();

	System.out.println("Enter student email: ");
	email=sc.nextLine();

	java[jindex]= new Java(id, name, phone, email);
	

	System.out.println("Student Details added Succesfully!!");
	
}

else
{
throw new StudentNotFoundException("Student details not found");

}
}
}
public  static void searchCourse()
{
System.out.println("Enter as course to search");
String course =sc.nextLine();
if
(course.equalsIgnoreCase("java")||course.equalsIgnoreCase("aws"));
{
	System.out.println("Course Found");
	
}



	throw new CourseNotFoundException("Course Not Found");



}
}





