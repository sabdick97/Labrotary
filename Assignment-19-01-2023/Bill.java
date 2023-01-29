package restaurant;

public class Bill {
String fname;
int qty;
double amt;
public String getFnamne() {
	return fname;
}
public void setFnamne(String fnamne) {
	this.fname = fnamne;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getAmount() {
	return amt;
}
public void setAmount(double amount) {
	amt = amount;
	
}
public Bill(String fnamne, int qty, double amount) {
	super();
	this.fname = fnamne;
	this.qty = qty;
	amt = amount;
	
}
public Bill() {
	super();
	// TODO Auto-generated constructor stub
}
}
