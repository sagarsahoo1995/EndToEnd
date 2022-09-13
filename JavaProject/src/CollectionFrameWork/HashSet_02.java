package CollectionFrameWork;

import java.util.HashSet;

public class HashSet_02 {
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(100);
		hs.add(1000);
		hs.add(10000);
		System.out.println(hs);

		
		
		
		HashSet<Integer> hs_01 = new HashSet<Integer>();
		
		hs_01.addAll(hs);
		hs_01.add(500);
		System.out.println(hs_01);
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(3);
		hs1.add(1003);
		hs1.add(10003);
		hs1.add(100003);
		hs_01.addAll(hs1);
		System.out.println(hs_01);
		hs_01.removeAll(hs);
		System.out.println(hs_01);
	}

}
