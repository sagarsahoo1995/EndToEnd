package interfaceJava;

public interface RBI {
	
	public void educationLoan();
	
	public void homeLoan();
	
	public void carLoan();
	
	public default  void termloan() {
		System.out.println("Term loan ");
		
		
	}
	
	
	// No method body only method prototype.
	// We can't be create object of interface.
	// No static method but variables are static in nature by default
	// Abstraction --100%
	// Implement the interface/abstract on child class. Mean pass the method body 
	// The combination one class and multiple can inherit.
	//all the properties of interface are final

}
