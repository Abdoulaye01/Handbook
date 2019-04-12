package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Before Testing import the JUnit Library
 * This is the unit test for the Triangle class; it defines objects used by one 
 * or more tests.
 *In JUnit 4 no need to inherit from TestCase
 *All tests are named test[Something]
 */
public class TestRectangle {

	@Test
	public void TestCalculateArea() {
		assertEquals(12, new Rectangle().calculateArea(3, 4));
	}
}
