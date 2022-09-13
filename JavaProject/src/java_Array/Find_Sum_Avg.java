package java_Array;

public class Find_Sum_Avg {
	
	
	public static void main(String[] args) {
		
		int array[] = {10,20,30,40};
		
		
		int sum =0;
		
		for(int i=0; i<array.length;i++) {
			sum = sum+array[i];
			System.out.print(array[i]+" " );
			
		}
		System.out.println();
		System.out.println("Sum of Array: " +sum);
		double avg = sum/array.length;
		System.out.println(avg);
		System.out.println(array.length);
	         
	}

}