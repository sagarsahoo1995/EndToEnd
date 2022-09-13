package classAndMethod;

public class Bus {
	// we can overload main method 
	
	public static void main(String[] args) {
		
		
		Bus.main(10);
		Bus.main(10, 20);
		//Bus.main(null);
	} 
	
	
	public static void main(int a ) {
		System.out.println("Main Method ");
		
	}
	

	public static void main(int a, int b ) {
		
		System.out.println("Main method 2");
	}

}
