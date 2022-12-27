package oops;
public class InheritanceActivity {

	public static void main(String[] args) {
		Manager manager1= new Manager(111,"Rahul","Hydrabad",8479078708l,70900) ;
				
		System.out.println(" ");
		System.out.println("Emplyoee Type: " + manager1.emplyoeeType);
		manager1.display();
		
System.out.println("EmplyoeeSalary :" + manager1.calculatesalary());
	manager1.calculateTransportAllowance();
	
	System.out.println("   ");
	
	
	Trainee trainee1 =new Trainee(121,"Rohan","Kolkata",9477890789l,30000);
	System.out.println(" ");
	System.out.println("Emplyoee Type: "+ trainee1.emplyoeeName);
	trainee1.display();
	System.out.println("Emplyoee salary:" +trainee1.calculatesalary());
	trainee1.calculateTransportAllowance();
	System.out.println("  ");
	
	}
	
	

}
