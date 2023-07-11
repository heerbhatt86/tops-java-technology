package Tops_Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class reverse_arraylist {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		ArrayList list2= new ArrayList();
		
		

		list2.add("rahul");
		list2.add(40);
		list2.add('H');
		list2.add(45.45);
		list2.add(false);
		
		
		list.add("java");
		list.add("PHP");
		list.add(12);
		list.add(true);
		list.add(4.50);
		list.add("python");
		list.add('H');
		
		System.out.println(list);
	    System.out.println(list.subList(1, 4));
	    
		System.out.println(list.equals(list2));
		Collections.reverse(list);
		Collections.swap(list, 1, 3);
		System.out.println(list);
		
	}
}
