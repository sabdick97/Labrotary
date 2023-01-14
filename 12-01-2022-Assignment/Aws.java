package batchapplication;

public class Aws {
	private int Studentid;
	private String stdName;
	private long phone;
	private String email;
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Aws(int studentid, String stdName, long phone, String email) {
		super();
		Studentid = studentid;
		this.stdName = stdName;
		this.phone = phone;
		this.email = email;
	}
	public Aws() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
