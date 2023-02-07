package java8features;

import java.util.ArrayList;
import java.util.Collections;

class Person{
	
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}



public class LambdaComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Person> persons= new ArrayList<Person>();
		persons.add(new Person(101, "Sunita"));
		persons.add(new Person(102, "Amrita"));
		persons.add(new Person(103, "Riya"));

		
		
	System.out.println("Sorting Using Name");
	Collections.sort(persons,(p1,p2)->
	{
		return p1.name.compareTo(p2.name);
	});
	
	//print
	persons.forEach((p)-> System.out.println(p));
	
	System.out.println();
	System.out.println("Sorting Using id");
	
	Collections.sort(persons, (p1,p2)->
	{
		if(p1.id==p2.id)
			return 0;
		else if(p1.id>p2.id)
			return 1;
		else
			return -1;
		
		
	});
	
	//print 
	persons.forEach((p)-> System.out.println(p));
	
	
	
	}

}
 
