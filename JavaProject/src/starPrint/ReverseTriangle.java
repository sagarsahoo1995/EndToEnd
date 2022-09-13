package starPrint;

// Print below
//  *****
//  ****
//  ***
//  **
//  *
public class ReverseTriangle {
	 static int n = 6;

	public static void main(String[] args) {
		// outer loop handle row 
		for(int i =0; i<=n;i++) {
			
			for(int j = n-i ; j>1; j--) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		

	}

}
