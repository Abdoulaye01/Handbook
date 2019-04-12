package JUnitTesting;

/*
 * This is the unit test for the Triangle class; it defines objects used by one 
 * or more tests.
 *In Junit 4 no need to inherit from TestCase
 *All tests are named test[Something]
 */
public class Rectangle {

/*
 * Initialise @Test to a public void method to which 
 * it is attached can be run as a test case.
 */
 public int calculateArea(int length , int width){
         return  length * width;  
 }
	
	
}
