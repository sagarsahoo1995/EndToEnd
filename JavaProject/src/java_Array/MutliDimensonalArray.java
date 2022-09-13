package java_Array;

public class MutliDimensonalArray {

	public static void main(String[] args) {
		int array[][] = new int[2][2];
		int array1[][] = { { 1, 2 }, { 2, 3 }, { 4, 5 } };
		System.out.println(array.length);
		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j <2; j++) {
				
				System.out.print(array1[i][j]+" ");
				

			}
			System.out.println();

		}
		
		for(int[] a:array1) {
			
			for(int b: a) {
				
				System.out.println(b);
			}
		}

	}

}
