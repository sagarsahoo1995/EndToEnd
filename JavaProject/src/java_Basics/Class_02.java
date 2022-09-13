package java_Basics;

public class Class_02 {
	
	static int i =10;
	int j = 20;
	double myDouble = 3.4;
	float myFloat = 3.4F;

	public static void main(String[] args) {
		sagar1();
		
		Class_02 s = new Class_02();
		s.sagar2();
		s.sagar("Java Programming");
		s.test();
		
		System.out.println(i);
		System.out.println(s.j);
		System.out.println(s.myDouble + "" + s.myFloat);

	}
	
	public void test() {
		
		sagar("Java Programming for non static method");
		sagar1();
		int a= 10;
		int b = 320;
		int sum = a+b;
		System.out.println(sum);
	}
	
	void sagar(String str ) {
		System.out.println(str);
		int a= 5;
		int b=20;
		int sum = a+b;
		System.out.println(sum);
		
		
	}
	
 static  void sagar1() {
	 System.out.println("Sagar1");
		
		
	}
 public   void sagar2() {
	 System.out.println("Sagar2");	
		
	}

 public  void demo() {
	 System.out.println(j);
	 System.out.println(i);
  
	 
	 
 }
  Class_02(){
	  System.out.println(i);
	 
	 
}
}
