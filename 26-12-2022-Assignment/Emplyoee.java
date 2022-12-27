package oops;

public class Emplyoee
{
long emplyoeeId;
String emplyoeeName;
String emplyoeeAddress;
long emplyoeePhone;
double basicSalary;
final double specialAllowance= 250.80;
final double hra =1000.50;


public Emplyoee(long emplyoeeId, String emplyoeeName, String emplyoeeAddress,long emplyoeePhone) {
	super();
	
	this.emplyoeeId=emplyoeeId;
	this.emplyoeeName=emplyoeeName;
	this.emplyoeeAddress=emplyoeeAddress;
	this.emplyoeePhone=emplyoeePhone;
}
public double calculatesalary() {
	
	double salary= (basicSalary+(basicSalary*specialAllowance/100)+ (basicSalary*hra/100));
	return salary;
		
}

public void calculateTransportAllowance() {
	double transportAllowance=((10*basicSalary)/100);
	System.out.println("Transport Allowance: "+transportAllowance);
}



public void display() {
	System.out.println("Emplyoee Name:" + emplyoeeName);
	System.out.println("Emplyoee Id: " + emplyoeeId);
	System.out.println("Emplyoee Address: " + emplyoeeAddress);
	System.out.println("Emplyoee Phone No. :" + emplyoeePhone);
		
	
}



	}
	
class Trainee extends Emplyoee{
	
	final String emplyoeeName= "Trainee";

	public Trainee(long emplyoeeId, String emplyoeeName, String emplyoeeAddress, long emplyoeePhone, double salary) {
		super(emplyoeeId, emplyoeeName, emplyoeeAddress, emplyoeePhone);
		
		this.basicSalary=salary;
	}
	
	
}






 class Manager extends Emplyoee{
	 String emplyoeeType= "Manager";

	public Manager(long emplyoeeId, String emplyoeeName, String emplyoeeAddress, long emplyoeePhone,double salary) {
		super(emplyoeeId, emplyoeeName, emplyoeeAddress, emplyoeePhone);

		
		this.basicSalary=salary;
	}
	
	public void calculateTransportAllowance() {
		
		double transportAllowance=((15*basicSalary)/100);
		System.out.println("Transport Allowance: "+transportAllowance);	
		
		
		
	}
	
	
	
	}

















