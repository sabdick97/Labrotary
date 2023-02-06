package oops;
abstract class B
{
abstract void display();
public void demo()
{
	System.out.println("Abstract class");
}
}

interface C
{
void add (int a, int b)	;
}


class D extends B implements C{

	@Override
	public void add(int a, int b) {
		System.out.println("Sum :" +(a+b));
		
	}

	@Override
	void display() {
		System.out.println("Multiple inheritance achieved");
		
	}
	
	
}




public class MultipleInheritance {

	public static void main(String[] args) {
		
		D d= new D();
		d.add(49, 70);
		d.display();

	}

}
