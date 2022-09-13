package CollectionFrameWork;

import java.util.PriorityQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Queue_01 {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();

		pq.add(10);
		pq.add(20);
		pq.add(50);
		pq.offer(50);

		System.out.println(pq); // [10, 20, 50, 50]

		// Header Element
		System.out.println(pq.peek());
		System.out.println(pq.element()); // java.util.NoSuchElementException if queue is empty

		// Return and Remove Element the elements

		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

		for (Object a : pq) {

			System.out.println(a);
		}

		java.util.Iterator it = pq.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
