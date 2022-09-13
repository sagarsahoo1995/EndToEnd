package CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_01 {
	
	public static void main(String[] args) {
		
		
		
		HashMap<Integer, String> m= new HashMap();
		
		m.put(10, "Emp_01");
		m.put(20, "Emp_01");
		m.put(30, "Emp_02");
		m.put(40, "Emp_04");
		m.put(null, "Emp_05");
		System.out.println(m);
		m.put(40, "Sagar");
		System.out.println(m);
		System.out.println(m.get(20));
		m.remove(40);
		System.out.println(m);
		System.out.println(m.containsKey(null));
		System.out.println(m.containsValue("Emp_04"));
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.values());
		m.replace(10, "Sahoo");
		System.out.println(m);
		System.out.println("Entry Set: "+m.entrySet());
		for(Object i: m.keySet())
		{
			
			System.out.println(i);
		}
		
		for(Object j: m.keySet()) {
			
			System.out.println(j+ " :"+m.get(j));
		}
		
	// Entry 	
		
		for(Map.Entry entry:m.entrySet() ) {
			System.out.println(entry.getKey()+
					
					"  "+entry.getValue());  
			
		}
		
		//Iterator 
		
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+ " :"+entry.getValue());
			
			
		}

		
	}

}
