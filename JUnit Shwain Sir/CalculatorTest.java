package co.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CalculatorTest {

	Calculator cal;
	@BeforeAll
	
	static void beforeAllInit()
	{
		System.out.println("Before All: This will execute before all test cases ");
	}
	
	@AfterAll
	static void afterAllInit()
	{
		System.out.println("After All: This will execute after all test cases");
	}
	@BeforeEach
  void beforeEachInit()
	{
		cal= new Calculator();//  new object
	}
	@AfterEach
	void cleanup()
	{
		cal=null;//null reference
	System.out.println("Clean Up...");
    }
	
	@Test
	@DisplayName("Testing Addition")
	
	void testAddition()
	{
		//Calculator cal = new Calculator();
		assertEquals(10,cal.addition(7, 3),
				"This test method is to test addition of two int values ");
		
	}
	@Test
	void testMultiplication()
	{
		//Calculator cal = new Calculator();
		assertEquals(27, cal.Multiplication(9, 3),
				"This test method is to test multiplication of two int values ");
	}


@Test
@DisabledOnOs(value= {OS.MAC,OS.LINUX})
// we are enabling that this test case can run only on system that has JRE 11 and 19
@EnabledForJreRange(min=JRE.JAVA_11,  max=JRE.JAVA_19)
// we are disabling this test who have system java 9
@DisabledOnJre(value= {JRE.JAVA_9})


	
	void testsubstraction()
	{
		assertEquals(81,cal.substraction(100, 19),
		"This test method is to test substraction of two int values ");
	}
	@Test
	void testdivision()
	{
		assertEquals(100, cal.division(200, 2),
		"This test method is to test division of two int values ");
	}
	@Test
	void testDivisionWithException()
	{
		assertThrows(ArithmeticException.class, ()-> cal.division(25, 0),
				"This test method is to test throws exception of two int values ");
	}
	
	@Test
	@DisplayName("Testing factorial method")
	void testFactorial()
	{
		System.setProperty("Job", "Dev");
		//assumeTrue("Dev".equals(System.getProperty("Job")));
		//assumeFalse("Dev".equals(System.getProperties("Job")), CalculatorTest::message);
		assertEquals(120, cal.factorial(5));
	}
	
	private static String message()
	{
		return "Test Execution Has failed!!";
	}
	
	
}
