package com.emp.service;

import java.util.ArrayList;
import java.util.List;

import com.emp.entity.Address;
import com.emp.entity.Emplyoee;
import com.emp.exception.GlobalException;




public class EmplyoeeService {
private List<Emplyoee> Emplyoee = new ArrayList<Emplyoee>();

// method to add Emplyoee details in array list

public void addEmplyoee(long empId, String empName, double empSal, String city, String country)
{
	Address add= new Address(city, country);
	//Emplyoee emp= new Emplyoee  
	Emplyoee.add(new Emplyoee(empId,empName,empSal,add));
}

// for testing using builder annotation
public void addEmp(Emplyoee emp)
{
	Emplyoee.add(emp);
	}
//method to display emplyoee details using id
public Emplyoee displayEmpById(int id)throws GlobalException
{
	for (int i=0;i<Emplyoee.size();i++)
	{
		if(Emplyoee.get(i).getEmpId()==id)
		{
			return Emplyoee.get(i);
		}
		else
		{
			throw new GlobalException("Emplyoee Id not found");
			
		}
	}
	return null;//return emplyoee.get(id)

}
// method to update an emplyoee details

public Emplyoee updateEmplyoee(int index, Emplyoee emp) throws GlobalException
{
return Emplyoee.set(index, emp);
}


// method to update an emplyoee details
public Emplyoee updateemplyoee(int index, Emplyoee emp) throws GlobalException
{
	return Emplyoee.set(index, emp);
}	
// method to delete an emplyoee details
public void removeEmplyoeeById(int id) throws GlobalException
{
	for(int i=0;i<Emplyoee.size();i++)
	{
		if(Emplyoee.get(i).getEmpId()==id)
		{
			Emplyoee.remove(i);
		}
		else
		{
			throw new GlobalException ("Emplyoee with id" + id +"is not present");
		}
	}
}
		
//method to remove all emplyoees
public String removeAll()throws GlobalException
{
Emplyoee.clear();
return "All emplyoee details deleted succesfully";
}



		//find by id
public Emplyoee findId(int id)
{
Emplyoee emp=null;
for (int i=0;i<Emplyoee.size();i++)
{
	if(Emplyoee.get(i).getEmpId()==id)
	{
		emp=Emplyoee.get(i);
		//System.out.println(Emplyoee);
	}
	}
return emp;

}
//method to display all emplyoees
public void displayAllEmplyoees()
{
for(Emplyoee emp: Emplyoee)	
{
	System.out.println("Emplyoee ID: "+ emp.getEmpId());
	System.out.println("Emplyoee Name:"+emp.getEmpName());
   System.out.println("Emplyoee Salary: "+ emp.getEmpSal());
   System.out.println("Emplyoee Address :"+ emp.getAddress().getCity()+" ,"+emp.getAddress().getCountry());
}

}

//calculate salary
public double calculateYearlySalary()
{
int yearly =0;
double yearSal=0;
for(Emplyoee emp: Emplyoee)	

	
	{
		if(emp.getEmpSal()>0)
	{
		yearSal=(emp.getEmpSal()*12);
		System.out.println("Yearly salary: " +yearSal);
	}
	}
  return yearSal;
}

public void  calculateAppraisal() throws GlobalException
{
int apraisal=0;
for(Emplyoee emp:Emplyoee)
{
if (emp.getEmpSal()<20000)	
{
	apraisal=1500;
	System.out.println("You will get "+apraisal+"as appraisal");

}
else if(emp.getEmpSal()>20000 && emp.getEmpSal()<30000)
{
	apraisal=2000;
	System.out.println("You will get "+apraisal+"as appraisal");
}


else if (emp.getEmpSal()>30000)
	
{
	apraisal=2500;
	System.out.println("You will get "+apraisal+"as appraisal");
}
else
{
	throw new GlobalException("Salary Needed ");
	
	}
}
}



public int lengthofList()
{
	return Emplyoee.size();
}
}
