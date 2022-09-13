package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {

		try {
			int a = 50 / 0;
			System.out.println(a);
			System.out.println("Inside try block");// will not execute
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Execute the program");

		int a[] = { 1, 2, 3, 5 };

		try {
			System.out.println(a[5]);
		} catch (Exception e) {

			System.out.println(e);
			System.out.println("Handle Array");
		}

		String s = null;
		try {
			System.out.println(s);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
