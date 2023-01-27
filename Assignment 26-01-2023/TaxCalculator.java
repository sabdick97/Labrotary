package ExceptionHandling;

public class TaxCalculator {

	static void calculateTax(String empName,double empSal,boolean isIndian) {
	double taxAmount=0;
	{
		if (isIndian)
		{
			System.out.println(isIndian+ "Indian");
		}
			

		else
		{
			throw new CountryNotValidException(isIndian+ "Not Indian Citizen");
		}
		
		if((empName==null))
		{
			throw new EmployeeNameInvalidException(empName+"There is no name");
		}
		
		if(empSal>100000)
		{
			taxAmount=(empSal*8)/100;
			System.out.println("Tax amount is :"+taxAmount);
		}
		else if (empSal>=50000 && empSal<=100000)
		{
			taxAmount=(empSal*6)/100;
			System.out.println("Tax amount is :"+taxAmount);
			}
		else if (empSal>=30000 && empSal<50000)
		{
			taxAmount=(empSal*5)/100;
			System.out.println("Tax amount is :"+taxAmount);
		}
		else if (empSal>=10000 && empSal<30000)
		{
			taxAmount=(empSal*4)/100;
			System.out.println("Tax amount is :"+taxAmount);
			
		}
		else if(empSal<10000)
		{
			throw new TaxNotEligibleException("The emplyoee does not need to pay Tax");
		}
		
	else 
	{
		throw new TaxNotEligibleException("The employee does not need to tax");
	}
	
	}
	}
}
		
	
	
