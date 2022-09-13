package loop;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
System.out.println("Enter digit ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;

		}
		System.out.println("Count is: "+count);

	}

}
