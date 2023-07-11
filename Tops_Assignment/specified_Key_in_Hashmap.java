package Tops_Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class specified_Key_in_Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "java");
		map.put(2, "python");
		map.put(3, "c++");
		map.put(4, "PHP");
		map.put(5, "c");
		
		for(Map.Entry<Integer, String> e:map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
	}

}
