package coreJavaStandard;

/*
 * In this class, we are extending the Bank 
 * We also declare a boolean variable
 * @param    None
 */
public class AIB extends Bank{
	boolean hasMortgage = true ;
	
	
	/*
	 * a string variable
	 */
	String name = "AIB";
	
	/*
	 * This getName return a variable
	 * @return (name)
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	double getRateOfInterest(){
		 
	return 2.3;

	}
	
	/*
	 * for boolean properties getter method can be prefixed with “get” or “is” 
	 * otherwise it recommended to write it this way.
	 */
	public void customerWithMortgage() {
		
		double rate = 2.6;
		
		if(!hasMortgage){
			System.out.println(String.format("Customer with Mortgage pay  %d  %: " , rate  ));
		}else {
			System.out.println("In " + getName() + " if you do not have a mortage you will pay : " + getRateOfInterest() + " % in interest rate ."); 
		}

	}


}
