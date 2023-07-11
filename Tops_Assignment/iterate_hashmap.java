package Tops_Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class iterate_hashmap {
	public static void main(String[] args) {
		
		HashMap  map = new HashMap();
		
		map.put(1, "java");
		map.put(2, "python");
		map.put(3, "c++");
		map.put(4, "PHP");
		map.put(5, "c");
		
		System.out.println(map);
		System.out.println(map.size());
		
		
		
		Set s= map.entrySet();
		
		Iterator itr= s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
