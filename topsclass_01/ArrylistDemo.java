package topsclass_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrylistDemo {
	public static void main(String[] args) {
		
		ArrayList alist = new ArrayList();
		
	  alist.add(10);
	  alist.add("shraddha");
	  alist.add(10.10);
	  alist.add('s');
	  alist.add(true);
	  alist.add(null);
	  alist.add(10);
	  
	  System.out.println(alist);
	  
	  Iterator it = alist.iterator(); // use:to show element one by one
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  System.out.println(alist.clone());
	  System.out.println(alist.lastIndexOf(10));
	  System.out.println(alist.get(3));
	  System.out.println(alist.remove(1));
	  System.out.println(alist);
	  System.out.println(alist.remove("shraddha"));
	  System.out.println(alist);
	  System.out.println(alist.set(3, 5));
	  System.out.println(alist);
	  System.out.println(alist.size());
	  
	  
	  ListIterator lir = alist.listIterator();
	  
	 while (lir.hasNext())
	 {
		 lir.set(lir.next()+ " tops");
		 
		 
		 
	 }
	 lir = alist.listIterator();
	 while(lir.hasNext())
	  
	 {
		 System.out.println(lir.next());
	 }
	 while(lir.hasPrevious())
		 
	 {
		 System.out.println(lir.previous());
	 }
	 
	 
	}

	

}
