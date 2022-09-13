package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_01 {

	public static void main(String[] args) {

		HashSet hs = new HashSet(); // Default capacity 16 and load factor 0.75.

		HashSet hs_01 = new HashSet(100, (float) (0.80)); // Increase the initial capacity and load factor.

		// Add Element in HashSet

		hs.add(10);
		hs.add("Welcome");
		hs.add(true);
		hs.add('o');
		hs.add(null);
		// hs.add(10);

		System.out.println(hs);
		hs.remove(10);
		System.out.println(hs);
		System.out.println(hs.contains("Welcome"));
		System.out.println(hs.isEmpty());

		// Read data using for each loop
		for (Object a : hs) {

			System.out.print(a + "" + "  ");
		}
		System.out.println();
		// Read data using iterator

		Iterator it = hs.iterator();
		while (it.hasNext()) {

			System.out.print(it.next()+"  ");
		}

	}

}
