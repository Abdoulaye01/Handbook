package coreJavaStandard;

/*
 * This class extends the Bank 
 * And override the fuction.
 *
 */

public class BankOfIreland extends Bank {
	
	/*
	 * a string variable
	 */
	String name = "Bank Of Ireland";
	
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

	
	/*
	 * (non-Javadoc)
	 * @see coreJavaStandard.Bank#getRateOfInterest()
	 */
	double getRateOfInterest(){
		
		return 2.3;
		
	}  
	
	/*
	 * this method prints the name of the bank and interest rate
	 */
	public void getMortgage()
	{
		System.out.println("The interest rate of "  +  getName() + " is "   + getRateOfInterest() + " % in interest rate." );
		
	}
}  

