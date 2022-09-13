package encapsulation;

public class Test {

	public static void main(String[] args) {

		Encapsulation_01 e = new Encapsulation_01();

		e.setAge(10);
		e.setName("Sagar");
		e.setSalary(37000);

		System.out.println(e.getAge());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}
