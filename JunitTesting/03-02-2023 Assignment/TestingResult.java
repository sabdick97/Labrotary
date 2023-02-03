import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

//import com.test.TestingClass;
//import com.test.TestingClassTest;
@DisplayName("Testing TestingClass App")
public class TestingResult {
TestingClass cal;

	
	@BeforeAll
	static void beforeAllinit()
	{
		System.out.println("Before All: This will execute before all test cases.");
	}
	
	@AfterAll
	static void afterAllinit()
	{
		System.out.println("After All: This will execute after all test cases.");
	}
	
	//before each is used to execute before every method
	@BeforeEach
	void init()
	{
		cal = new TestingClass();
	}
	
	//after each is used to execute after every method
	@AfterEach
	void cleanUp()
	{
		cal = null; //null referencing
		System.out.println("Clean up....");
	}
	
	
	
	@Test
	@DisplayName("Testing Substraction Method")
	void testSubstraction()
	{
		//TestingClass cal = new TestingClass();
		assertEquals(10, cal.substraction(30, 20),
				"This test method is to test substraction of two values");
	}
	
	@Test
	//we are disabling this test to run on MAC OS
	@DisabledOnOs(value = {OS.MAC})
	//we are enabling that the test case can only run on system that has
	// JRE between java 8 to 20
	@EnabledForJreRange(min=JRE.JAVA_8, max=JRE.JAVA_20)
	// we are disabling this test case who has system JRE java 9
	@DisabledOnJre(value = {JRE.JAVA_9})
	void testMultiply()
	{
		//assertEquals(12, cal.multiplication(4, 3));
		assertAll(
				()->assertEquals(12, cal.multiplication(4, 3)),
				()->assertEquals(64, cal.multiplication(8, 8)),
				()->assertEquals(-3, cal.multiplication(3, -1)),
				()->assertEquals(25, cal.addition(21, 4))	
			);
		
	}
	
	@Test
	void testFactorial()
	{
		
//		boolean flag = false;
//		assertFalse(flag);
		
		System.setProperty("Job", "Developer");
		
		 assumeFalse("Developer".equals(System.getProperty("Job");
				
		//since we have assumed it to be false the test will abort
		// we are also calling the custom message to show that the test has failed
//		assertEquals(120, cal.factorial(5),
//				"This test method is to test factorial of a value");
	}
	
	public static String message()
	{
		return "Test Execution has failed!!";
	}
	
	@Test
	void divisionWithException()
	{
		assertThrows(ArithmeticException.class,
				()-> cal.division(10, 0));
	}
	
	@Nested
	@DisplayName("All Addition methods")
	class TestAdd{
		@Test
		@DisplayName("Testing Addition Method")
		void testAddition()
		{
//			TestingClass cal = new TestingClass();
			assertEquals(100.5, cal.addition(75.25, 25.25));
		}
		
		@Test
		@DisplayName("Testing addition of +ve no")
		void testAddingPositiveNos()
		{
			assertEquals(13, cal.addPositiveNumber(6, 7));
		}
		
		@Test
		@DisplayName("Testing additon of -ve no")
		void testAddingNegativeNos()
		{
			assertEquals(-10, cal.addNegativeNumber(-5, -5));
		}
	}
	
	@Test
	@Disabled
	void testDisable()
	{
		fail("This test should be disable");
	}
	
	//@Test
	@RepeatedTest(3)
	@DisplayName("Testing to find max number")
	void testFindMax()
	{
		System.out.println("Repeated Test");
//		int arr[]= {23,56,77,90,12};
//		assertEquals(90, cal.findMax(arr));
		
		assertEquals(-1, cal.findMax(new int[] {-1,-2,-99,-78,-55}));
	}
	
	@Test
	void test()
	{
		int num=7;
		String name="Rohit";
		String name1 = null;
		
		assertTrue(num<10); //asserting the conditions are true
		
		assertFalse(num>10); //asserting the conditions are false
		
		assertNotNull(name); //expecting name should not be null
		
		assertNull(name1); //expecting name should be null
	}
	
}
