package java_string;

public class String_01 {

	int a;

	public static void main(String[] args) {

		String_01 str = new String_01();
		String s3 = new String("Assign to me ");

		str.a = 10;
		System.out.println(str.a);
		String s = "sagar";
		String s1 = "SAGAR1";
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s = s1);
		str.a();
	}

	public void a() {

		String_01 st = new String_01();
		String_01.main(null);

	}
}
