package classAndMethod;

public class Class_01 {
	
	public static void main(String[] args) {
		method2(1,2);
		Class_01 c = new Class_01();
		
		c.method1(5);
		
	}
	
	int method1(int a) {
		System.out.println("Sagar");
		System.out.println(a);
		return a;
		
		
		
	}
	static int method2(int a, int b ) {
		System.out.println("Sagar1");
		
		return a+b;
		
		
	}

}
