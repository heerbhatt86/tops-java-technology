package Tops_Assignment;

import java.util.HashSet;

public class all_question_hashset {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		
		
		set.add("heer");
		set.add(45);
		set.add('A');
		set.add(8.09);
		set.add(false);
		set.add(null);
		set.add("heer");
		
		System.out.println(set);
		System.out.println(set.contains(45));
		System.out.println(set.size());

		
	}
	
	
}
