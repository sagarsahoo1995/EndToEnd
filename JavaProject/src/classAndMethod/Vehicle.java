package classAndMethod;

public class Vehicle {

	public int add(int a, int b) {
		int sum = a + b;
		return a+50;
	}

	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
		// return sum;

	}

	public static void main(String[] args) {

		Vehicle obj = new Vehicle();

		int sum1 = obj.add(10, 20);
		System.out.println(sum1);

		obj.add(11, 11, 11);

		// int sum2 = obj.add(10, 20, 50);
		// System.out.println(sum2);
		int x = 10;
		int y = 20;
		int sum3 = obj.add(x, y);
		System.out.println(sum3);

	}

}
