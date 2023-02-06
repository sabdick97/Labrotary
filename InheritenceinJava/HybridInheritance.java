package oops;


class Nine
{
	void college ()
	{
		System.out.println(" going to college");
	}


}


class Ten extends Nine{
void school()

{
	
	System.out.println("going to school");
	
}

}


class Eleven extends Ten{
	
	void hospital()
	{
		
		System.out.println("hospital is fun");
	}
	

}

class Fourteen extends Nine
{
	
void play ()
{
System.out.println(" Play is fun");	
}

}





public class HybridInheritance {

	public static void main(String[] args) {
		

		
		Fourteen t1= new Fourteen();
		t1.play();
		t1.college();
		
		Eleven e1= new Eleven();
				e1.hospital();
				e1.school();
				e1.hospital();
		
		
	}

}
