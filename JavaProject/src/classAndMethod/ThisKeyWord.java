package classAndMethod;

public class ThisKeyWord {

	int a;
	int b;

	ThisKeyWord(int a, int b) {
		this.a = a;
		this.b = b;

	}

	void display() {

		System.out.println(a + b);

	}

	public static void main(String[] args) {
		
		ThisKeyWord obj =new ThisKeyWord(10,20);
		obj.display();

	}

}
