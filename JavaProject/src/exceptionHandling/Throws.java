package exceptionHandling;

public class Throws {

	public void math() throws ArithmeticException {

		sum();

	}

	public void sum() throws ArithmeticException {

		System.out.println(9 / 0);

	}

	public static void main(String[] args) throws ArithmeticException {
		Throws t = new Throws();
		t.math();
		System.out.println("Throws exception");
	}

}
