package classAndMethod;

public class FinalKeyWord {
	
	final int a = 10;
	final int b = 20 ;
	
	
	final void display(int a, int b) {
		
		// this.a=a;
	
		System.out.println("Hello World ");
		
	}
	public static void main(String[] args) {
		FinalKeyWord obj = new FinalKeyWord();
		obj.display(10,20);
		
		
	}
	

}
