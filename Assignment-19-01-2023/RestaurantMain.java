package restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class RestaurantMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int id;
		
		Map<Integer, Restaurant> map= new HashMap<Integer,Restaurant>();

		map.put(1, new Restaurant ("Chiken Biriyani", 130));
		map.put(2, new Restaurant("Paneer Butter Masala", 120));
		map.put(3, new Restaurant(  "Masala Dhosa", 100));
		map.put(4, new Restaurant("Chiken Kosha", 170));
		map.put(5, new Restaurant("Mutton Kosha", 220));
		
		
		System.out.println("Welcome to Zomato Restaurant");
		System.out.println("============================");
		System.out.println("  MENU");
		System.out.println("==========");
		System.out.println("     ITEMS            PRICE");
		System.out.println("===============================");
		
		for(Map.Entry em: map.entrySet())
		{
			Restaurant rest= (Restaurant) em.getValue();
			System.out.print(em.getKey()+ ".");
			rest.display();
		}
		System.out.println();
		do {
			System.out.println("Enter food id: ");
			id=sc.nextInt();
			Restaurant rest=map.get(id);
			Billing.order(rest.getFname(),rest.getPrice());
			
			Billing.cont();
			
			
		}while(true);
		
		
		
	}

}
