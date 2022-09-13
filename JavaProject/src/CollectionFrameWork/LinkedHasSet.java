package CollectionFrameWork;

import java.util.LinkedHashSet;

public class LinkedHasSet {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		System.out.println(lhs);//[10, 20, 30, 40]
		//Insertion order is preserved.
	}

}
