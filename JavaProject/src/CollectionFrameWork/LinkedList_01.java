package CollectionFrameWork;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedList_01 {
	public static void main(String[] args) {

		// Declare Linked List

		LinkedList l = new LinkedList();

		// Add Elements
		l.add(100);
		l.add("Diwali");
		l.add(10.52);
		l.add("04-11-2021");
		l.add(true);
		l.add(null);
		System.out.println(l);
		System.out.println("Size of Linked List:" + l.size());
		l.remove(2);
		System.out.println(l);
		System.out.println("Size of Linked List:" + l.size());
		// add on middle of the linked list
		l.add(3, "Sagar");
		System.out.println(l);
		System.out.println("Size of Linked List:" + l.size());
		// Changes the elements
		l.set(1, 10);
		System.out.println(l);
		System.out.println(l.contains("500"));
		System.out.println(l.isEmpty());

		// Read data from linked list using for loop
		for (int i = 0; i < l.size(); i++) {

			System.out.print(l.get(i) + "" + " ");
		}
		System.out.println();
		// Read data using for each loop
		for (Object a : l) {

			System.out.print(a + " ");
		}
		System.out.println();
		// Read data using iterator method
	java.util.Iterator it = l.iterator();
	while(it.hasNext()) {
		
		System.out.print(it.next()+" ");
	}

	}

}
