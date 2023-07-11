package topsclass_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmappractice {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1,"heer");
		map.put(2, "anchal");
		map.put(3, "shraddha");
		map.put(4, "viral");
		map.put(5, "dhruv");
		
		
		System.out.println(map);
		System.out.println(map.remove(2));
		System.out.println(map);
		
		Set s = map.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	
	
	
	

}
