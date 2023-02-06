package oops;
class User{
	int id;
	String name,address;
	public void setData (int id, String name, String address )
	{
	this.id=id;
	this.name=name;
	this.address=address;
			
	}
	public void display()
	{
	System.out.println("ID : "+ id);
	System.out.println("Name : "+name);
	System.out.println("Address :" + address);
		
	}
}

class Teacher extends User{
	
	double salary;
	String subject;
	
	public void setData(int id, String name, String address, double salary, String subject)
	{
		super.setData(id,name,address);
		this.salary=salary;
		this.subject=subject;
		
		
		
	}

	public void display() {
		super.display();
		System.out.println("Salary : "  + salary);
		System.out.println("Subject :" + subject);
	}
	}

public class SingleInheritence {

	public static void main(String[] args) {
		
Teacher teacher1=new Teacher();
teacher1.setData(109, "Sabdick", "Kolkata", 1000000, "Developer");
teacher1.display();
	}

}
