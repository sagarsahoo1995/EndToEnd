package exceptionHandling;

public class Throw {

	public static void main(String[] args) {

		System.out.println("Usr defined exception:throw");
		try {
			throw new Exception("This is an Exception");
		} catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();

		}
		System.out.println("Usr defined exception:throw");

	}

}
