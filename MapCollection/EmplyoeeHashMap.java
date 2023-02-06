package MapCollection;



	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;

	public class EmplyoeeHashMap {

		public static void main(String[] args) {
			Map<Integer, Emplyoee> empMap = new HashMap<Integer, Emplyoee>();
			
			//create employee objects
//			Employee emp1 = new Employee(101, "Shawin");
//			Employee emp2 = new Employee(102, "Sandeep");
//			Employee emp3 = new Employee(103, "Riya");
//			Employee emp4 = new Employee(104, "Pratiksha");
			
			//storing the information in hash map
//			empMap.put(emp1.getEmpId(), emp1);
//			empMap.put(emp2.getEmpId(), emp2);
//			empMap.put(emp3.getEmpId(), emp3);
//			empMap.put(emp4.getEmpId(), emp4);
			
			//way 2 reduce the boiler plate codes by declaring anonymously
			empMap.put(1, new Emplyoee(101, "Shawin"));
			empMap.put(2,  new Emplyoee(103, "Sandeep"));
			empMap.put(3,  new Emplyoee(104, "Riya"));
			empMap.put(4,  new Emplyoee(105, "Pratiksha"));
			
			//display
			Set<Map.Entry<Integer, Emplyoee>> employees = empMap.entrySet();
			
			for(Map.Entry em: employees)
			{
				System.out.println("Key: "+em.getKey());
				Emplyoee employ=(Emplyoee) em.getValue();
				employ.display();
				System.out.println();
			}
			
			//using iterator
			System.out.println("Printing using iterator:");
			Iterator itr=empMap.keySet().iterator();
			
			while(itr.hasNext())
			{
				Emplyoee emp=empMap.get(itr.next());
				emp.display();
				System.out.println();
			}
			}
	}
	
			
		
		

	

	


