package coreJavaStandard;

/*
 * This class extends the Bank 
 * And override the function.
 *
 */
public class UlsterBank extends Bank {
	
	/*
	 * a string variable
	 */
	String name = "Ulster Bank";
	
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
	 * 
	 */
	double getRateOfInterest(){
		 return  2.5;
	}
	
	/*
	 * this method prints the name of the bank and interest rate
	 */
	public void getMortgage()
	{
		System.out.println("The interest rate of "  +  getName() + " is "   + getRateOfInterest() + " % in interest rate." );
		
	}

}
