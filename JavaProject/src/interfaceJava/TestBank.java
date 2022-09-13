package interfaceJava;

public class TestBank {
	
	public static void main(String[] args) {
		
		ICICIBank icici = new ICICIBank();
		icici.carLoan();
		icici.credit();
		icici.educationLoan();
		icici.mutualFund();
		System.out.println(UsBank.min_Bal);
		icici.icic();
		icici.termloan();
		
		
		UsBank us = new ICICIBank();
		us.credit();
		
		
		
		
		
		
	}

}
