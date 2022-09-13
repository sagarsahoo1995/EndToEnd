package classAndMethod;

public class Car {

	// constructor
	int a;

	Car() {

		System.out.println("Welcome To Java");

	}
	
	Car(int a){
		this.a=a;
		System.out.println("Welcome to Selenium");
		
	}

	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car(10);
		System.out.println(c.a);

	}

}
