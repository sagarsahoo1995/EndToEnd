package CollectionFrameWork;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_02 {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(300);
		l.add(60);
		l.add(40);
		LinkedList<Integer> lNew= new LinkedList<Integer>();
		lNew.addAll(l);
		System.out.println(lNew);
		lNew.removeAll(l);
		System.out.println(lNew);
		
		//Sorting 
		Collections.sort(l);
		System.out.println(l);
		// reverse 
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		// Shuffling 
		Collections.shuffle(l);
		System.out.println(l);
		
	}

}
