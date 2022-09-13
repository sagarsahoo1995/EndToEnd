package CollectionFrameWork;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();// Capacity is 11 and load factor is 0.75.

		h.put(10, "Name_01");
		h.put(20, "Name_03");
		h.put(30, "Name_01");
		h.put(10, "Sagar");
		System.out.println(h);
		System.out.println(h.get(10));
		System.out.println(h.values());
		System.out.println(h.keySet());
	}

}
