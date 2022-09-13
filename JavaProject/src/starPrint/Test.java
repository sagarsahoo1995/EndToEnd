package starPrint;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Q.1 Print Right Angle Triangle 
		System.out.println("Enter the Row Size: ");
		Scanner scan = new Scanner(System.in);
		int Number = scan.nextInt();
		
		for(int i=0; i<Number ;i++) {
			
			for(int j=0;j<=i;j++) {
				
				     System.out.print("*");
			} 
			
	          System.out.println();
		}
		
		
		//Q.2  Print Right Angle Triangle
		
        for(int i=0; i<Number ;i++) {
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
