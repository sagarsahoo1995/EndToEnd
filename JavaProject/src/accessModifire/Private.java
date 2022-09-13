package accessModifire;

public class Private {

	private int a;
	private int b;

	private void sum() {
		int a = 10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Private p= new Private();
		System.out.println(p.a);
		p.sum();

	}

}
