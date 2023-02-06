package MapCollection;

public class Emplyoee {

	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Emplyoee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Emplyoee() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public void display()
	{
		System.out.println("Emp Id: "+getEmpId());
		System.out.println("Emp Name: "+getEmpName());
	}
	}
	
