package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String>names=new LinkedList<String>();
		names.add("Sabdick");
		names.add("Tintin");
		names.add("Rohan");
		names.add("Ankit");
		names.add("Ankush");
		
		
		System.out.println(names);
		
			//for each loop using
		System.out.println("Printing elements using for each loop");
		for (String a:names)
		{
			System.out.println(a);
			}
		System.out.println();
		// using while loop
		int count=0;
		System.out.println("While loop :");
		while(count<names.size())
		{
			System.out.println(names.get(count));
			count++;
		}
		System.out.println();
		//using Iterator
		Iterator<String> itr= names.iterator();
		System.out.println("using iterator:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("Performing Adding operation");
		names.addFirst("Ponting");
		names.lastIndexOf("Gleen");
		names.add(3, "Dhoni");
		System.out.println(names);
		System.out.println();
		
		System.out.println("Performing removing operation:");
		names.removeFirst();//removing first element
		names.removeLast();//removing last element
		names.remove(2);//removing from index 2
		System.out.println(names.remove("Tintin"));//removing using object
		System.out.println(names);
		
		System.out.println();
		names.set(3, "Dravid");
		
	String name =names.get(1);
	System.out.println(name);
	
	//names.removeAll(names);
	//System.out.println(names);
		
	//names.clear(); //it clears the linked list and makes it empty
	//System.out.println(names);
	
	
	ListIterator listit=names.listIterator();
	System.out.println("Forward Direction");
	while(listit.hasNext());
	{
		System.out.println(listit.next());
	}
	System.out.println();
	
	System.out.println("Backward Direction");
	while(listit.hasPrevious());
	{
		System.out.println(listit.previous());
	}
	System.out.println();
	
	System.out.println("Printing in reverse using decending iterator:");
	Iterator itr1 =names.descendingIterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	System.out.println();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a name to check");
	String str=sc.next();
	//checking the contents using if loop using contains keyword
			
		if (names.contains(str))
		{
			System.out.println("Data is Present");
			
		}
		else
		{
			System.out.println("Data is not Present");
		}
		
		names.add("Gayle");
		System.out.println(names);
		System.out.println(names.lastIndexOf("Pooran"));
		
		System.out.println(names);
		
		System.out.println("Element poll: "+names.pop());
		System.out.println(names);
		
		System.out.println("Element poll:");
	}
	
	}


