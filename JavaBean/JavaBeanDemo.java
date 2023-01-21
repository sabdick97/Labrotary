package oops;
class College{
	private int collegeid;
	private String collegename;
	
	//no-args constructor
	
	public College() {
		super();
		
	}
	//parameterized constructor
		public College(int collegeid, String collegename) {
		super();
		this.collegeid = collegeid;
		this.collegename = collegename;
	}


public int getCollegeid() {
			return collegeid;
		}
		public void setCollegeid(int collegeid) {
			this.collegeid = collegeid;
		}
		public String getCollegename() {
			return collegename;
		}
		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}


@Override
		public String toString() {
			return "College [collegeid=" + collegeid + ", collegename=" + collegename + "]";
		}

}





public class JavaBeanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
College college1= new College();
college1.setCollegeid(100);
college1.setCollegename("Anudip");
System.out.println(college1);
	
	}
	}
