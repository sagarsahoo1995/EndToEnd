package starPrint;

// Print Following:
//    *
//   ** 
//  ***
// ****
//***** 
public class RightAngleTRiangle_01 {

	public static void main(String[] args) {

		// outer loop Handle The Row
		int n = 5;
		for (int i = 0; i < n; i++) {

			// inner loop to Handle Space

			for (int j = n - i; j > 1; j--) {

				System.out.print(" ");
			}

			// inner loop to handle Column

			for (int k = 0; k <= i; k++) {

				System.out.print("*");
			}
// Jump to new line
			System.out.println("");
		}

	}
}
