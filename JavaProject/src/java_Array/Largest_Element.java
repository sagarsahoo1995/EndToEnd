package java_Array;

public class Largest_Element {
	
	public static void main(String[] args) {
		
		
		int arr[] = {17,14,16,21,9};
		int largest = arr[0];
		for(int i =0; i<arr.length;i++) {
			
			if(largest<arr[i]) {
				
				largest = arr[i];
			}
		}
		System.out.println(largest);
		System.out.println("_________________");
		
		for(int a:arr) {
			
			System.out.print(a+" " );
		}
		System.out.println();
		// reverse array
		for(int i = arr.length-1; i>=0;i--) {
			System.out.print(arr[i]);
		}
		
	}

}
