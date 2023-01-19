package restaurant;

public class Restaurant {
 String Fname;
 int price;
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Restaurant(String fname, int price) {
	super();
	Fname = fname;
	this.price = price;
}
public Restaurant() {
	super();
	// TODO Auto-generated constructor stub
}
 
 public  void display()
 {
	 System.out.println(" "+getFname()+"\t"+getPrice());
 }
 
 
 
}
