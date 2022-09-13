package exceptionHandling;

public class Finaly {

	public static void main(String[] args) {

		int a =0;
		int b = 20;

		try {
			
			int c = b / a;
			System.out.println(c);
		} catch (Throwable e) {

			System.out.println(e);

		}
		
		finally {
			
			System.out.println("Final Block should execute");
			
		}
	}

}
