package JUnitTesting;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/*
 * Before Testing import the Junit Library
 * This is the unit test for the Triangle class; it defines objects used by one 
 * or more tests.
 *In JUnit 4 no need to inherit from TestCase
 *All tests are named test[Something]
 */
public class TestTriangle {
	private Triangle t;
	


	/*
	 * @Before to a public void method causes that method 
	 * to be run before each Test method.
	 */
	@Before 
	public void setUp() throws Exception {
		t = new Triangle(3, 4, 5);
	}
	
	
	/*
	 * Initialise @Test to a public void method to which 
	 * it is attached can be run as a test case.
	 */

	@Test
	public void testIsScalene() {  
		assertTrue(t.isScalene());
		System.out.println("test on scalene is true");
	}

	@Test
	public void testIsEquilateral() {
		assertFalse(t.isEquilateral());

	} 

	

}


