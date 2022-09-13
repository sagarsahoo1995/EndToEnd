package demo;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		System.out.println("Enter The Number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num == 15251) {

			System.out.println("The Number Is correct:  " + num);

		}

		else {

			System.out.println("The Number is incorrect");
		}

	}

}
