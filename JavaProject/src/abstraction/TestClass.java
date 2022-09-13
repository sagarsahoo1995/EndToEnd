package abstraction;

public class TestClass extends DataAbstract {
	
	public static void main(String[] args) {
		
		DataAbstract t = new TestClass();
		t.display();
		t.sum();
		
	}

	@Override
	public void display() {
		System.out.println("Diasply");
		
	}

}
