package inheritance;

public class TestCar {

	public static void main(String[] args) {
		// Static Polymorphism
		BMW b = new BMW();
		b.start();
		b.Fueling();

		Car c = new Car();
		c.start();
		c.stop();

		// Dynamic Polymorphism [only the common and parent method should call ]
		// Top casting.
		// Down casting is not allowed.
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();

	}

}
