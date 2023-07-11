package Tops_Assignment;

import java.util.ArrayList;

public class join_two_Arraylist {
	
	
	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
	 
		
		
		list.add("java");
		list.add("PHP");
		list.add(12);
		list.add(true);
		list.add(4.50);
		list.add("python");
		list.add('H');
		
		
		list2.add("rahul");
		list2.add(40);
		list2.add('H');
		list2.add(45.45);
		list2.add(false);
		  ArrayList a= new ArrayList();
		   
		   a.addAll(list);
		   a.addAll(list2);
		   System.out.println(a);
		
		
	}

}
