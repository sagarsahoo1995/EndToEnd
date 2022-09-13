package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_01 {

	public static void main(String[] args) {

		List<String> al1 = new ArrayList<String>();
		al1.add(0, "List_01");
		al1.add(1, "List_02");
		System.out.println(al1);

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al.get(0));
		System.out.println(al.size());
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		// add new element by index and value
		al.add(2, 100);
		System.out.println(al);
		// Changes the element
		al.set(2, 5000);
		System.out.println(al);
		// Search --> Contains()
		System.out.println(al.contains(200));
		System.out.println(al.contains(20));
		// isEmpathy
		System.out.println(al.isEmpty());
		// Read the data using for loop

		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");

		}
		System.out.println();
		// Read the data using for each loop

		for (Object a : al) {
			System.out.print(a + " ");

		}
		System.out.println();
		// Read the data using iterator method

		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		
	}

}
