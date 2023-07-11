package topsclass_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put(1, "guru");
		map.put(2, "shraddha");
		map.put(3, "anchal");
		map.put(4, "viral");
		
		
		System.out.println(map);
		
		System.out.println(map.get(2));
		System.out.println(map.remove(2));
		System.out.println(map);
		System.out.println(map.remove(1));
		System.out.println(map);
		System.out.println(map.size());
		
		Set s =map.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
