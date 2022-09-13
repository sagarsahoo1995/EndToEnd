package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_02 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(40);

		// use addAll we can add all the element on another arrayList

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.addAll(al);
		System.out.println(al1);
		// Remove all the elements

		al1.removeAll(al);
		System.out.println(al1);

		// Sorting

		Collections.sort(al);
		System.out.println(al);

		// Reverse order

		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		//shuffling
		Collections.shuffle(al);
		System.out.println(al);
		
		
		int a[] = {10,20,30,40};
		// Convert array to array list
		
		ArrayList ar = new ArrayList(Arrays.asList(a));
		System.out.println(ar);
		
		
		

	}

}
