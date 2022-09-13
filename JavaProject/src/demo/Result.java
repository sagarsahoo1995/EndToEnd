package demo;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10th:");
		int ten = scan.nextInt();
		System.out.println("Enter 12th ");
		int twl = scan.nextInt();
		System.out.println("Enter Graudation: ");

		int gra = scan.nextInt();

		//int cgpa = scan.nextInt();

		if (ten >= 60 && twl >= 60 && gra > 60) {

			System.out.println("Eligible  for campus ");
			
			System.out.println("Enter GDPA:");
			int cgpa = scan.nextInt();
			if (cgpa >=8) {

				System.out.println("select for tcs and wipro ");
			}

			else if (cgpa >= 7) {

				System.out.println("select for  wipro ");
			} 
			else {
				System.out.println("Not selected ");

			
			}
		}
		
		else {

			System.out.println("Not eligible for campus");
		
		}
	}
}

