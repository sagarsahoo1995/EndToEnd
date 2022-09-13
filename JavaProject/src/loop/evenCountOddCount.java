package loop;

import java.util.Scanner;

public class evenCountOddCount {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Digit:");
		Scanner scan =new Scanner(System.in);
		int dig = scan.nextInt();
		
	
		int evencount =0;
		int oddcount = 0;
		while(dig>0) {
			
			int reminder = dig%10;
			if(reminder%2==0) {
				
				evencount++;
			}
			else {
				oddcount++;
			}
			dig=dig/10;
			
		}
		System.out.println("Even Count:"+evencount);
		System.out.println("Odd Count:"+oddcount);
		scan.close();
	}

}
