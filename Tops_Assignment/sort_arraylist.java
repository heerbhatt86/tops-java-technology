package Tops_Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class sort_arraylist {
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		
		list.add("green");
		list.add("red");
		list.add("yellow");
		list.add("blue");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
