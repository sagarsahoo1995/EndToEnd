package constructor;

public class Child extends Parent {

	public  Child() {
		// super();
		super(10);
		//System.out.println("Child Class");

	}

	public Child(int a) {
		super(10, "demo");
		// super(10);
	//	System.out.println("Child Class");

	}

	public static void main(String[] args) {
		Child c = new Child();
		Child c1 = new Child(10);
		

	}
}
