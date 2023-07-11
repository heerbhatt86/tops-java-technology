package Tops_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class all_question_Arraylist {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2= new ArrayList();
		
		list2.add("rahul");
		list2.add(40);
		list2.add('H');
		list2.add(45.45);
		list2.add(false);
		
		
		list.add("heer");
		list.add(45);
		list.add('A');
		list.add(10.10);
		list.add(2);
		list.add(null);
		list.add(true);
		
		
		
		System.out.println(list);
		list.add(0, "shraddha");
		
		System.out.println(list);
	System.out.println(list.get(4));
	System.out.println(list.set(0, "anchal"));
	System.out.println(list);
	System.out.println(list.remove(2));
	System.out.println(list);
	System.out.println(list.contains("anchal"));
	
	Collections.copy(list, list2);
	System.out.println(list);
	System.out.println(list2);
	
	Collections.shuffle(list2);
	System.out.println(list2);
	Collections.reverse(list2);
	System.out.println(list2);
	System.out.println(list2.subList(0, 3));
	
	
	
		
		
		Iterator it= list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
	
	

}
