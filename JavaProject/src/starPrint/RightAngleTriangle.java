package starPrint;

public class RightAngleTriangle {

	public static void main(String[] args) {
		
		
		int i, j;
		int n =5;
		//outer loop o handle row 
		for(i=0;i<=n;i++) {
		//inner loop to handle column
			for (j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			//sagar123
			System.out.println();
		}

	}

}
