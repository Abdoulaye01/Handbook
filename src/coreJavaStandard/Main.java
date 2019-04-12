package coreJavaStandard;

/*
 * This is the Main Class, it contains all the classes declared.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("===========Type Of Interest Rate=============== \n");
		
		BankOfIreland bankOfIreland = new BankOfIreland();
		bankOfIreland.getMortgage();
		System.out.println();
		
		System.out.println("===============================\n");
		
		
		AIB aib = new AIB();
		aib.customerWithMortgage();
		 
		
		System.out.println();
		System.out.println("===============================\n");
		
		UlsterBank ulsterBank = new UlsterBank();
		ulsterBank.getMortgage();
		
	}

}
