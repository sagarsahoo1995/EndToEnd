package CollectionFrameWork;

import java.util.LinkedList;

public class LinkedList_03 {

	public static void main(String[] args) {
		// Stack and Queue Concept
		// Stack: First In First Out
		// Queue: First In Last Out

		LinkedList<String> str = new LinkedList<String>();
		str.add("Happy");
		str.add("Diwali");
		str.add("Happy");
		str.add("Holi");
		System.out.println(str); // [Happy, Diwali, Happy, Holi]
		str.addFirst("New Yaer");
		System.out.println(str);
		str.addLast("X-mas");
		System.out.println(str);
		System.out.println(str.getFirst() + " ****** "+ str.getLast());
		str.removeFirst();
		System.out.println(str);

	}

}
