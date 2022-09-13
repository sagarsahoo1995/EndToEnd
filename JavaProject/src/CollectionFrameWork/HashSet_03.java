package CollectionFrameWork;

import java.util.HashSet;

public class HashSet_03 {
	
	
	public static void main(String[] args) {
		
		
		HashSet<Integer>hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		System.out.println(hs);
		HashSet<Integer>hs_01 = new HashSet<Integer>();
		hs_01.add(10);
		hs_01.add(2);
		hs_01.add(3);
		hs_01.add(40);
		System.out.println(hs_01);
		
		/*
		 * // Union 
		 * hs.addAll(hs_01); System.out.println("Union: "+hs);
		 */
		
		/*
		 * // Intersection
		 * 
		 * hs.retainAll(hs_01); System.out.println("Intersection"+hs);
		 */
		
		/*
		 * //Difference hs.removeAll(hs_01); System.out.println(hs);
		 */
		
		//sub set
		
	
		System.out.println(hs.containsAll(hs_01));
		
	}

}
