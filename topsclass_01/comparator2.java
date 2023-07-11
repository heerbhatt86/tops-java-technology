package topsclass_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class comparator2 implements Comparator<employee2> {

	
	public int compare(employee2 e1, employee2 e2) {
		int value =0;
		
		if(e1.getSalary()>e2.getSalary()) {
			return -1;
		}
		else if (e1.getSalary()<e2.getSalary()) {
			return 1;
		}
		else if (e1.getSalary()==e2.getSalary()) {
			return 0;
		}
	
		return value;
	}
	public static void main(String[] args) {
		ArrayList<employee2> list = new ArrayList<employee2>();
		
		employee2 e1= new employee2();
		e1.setEid(1);
		e1.setEname("heer");
		e1.setSalary(5000);
		
		employee2 e2 = new employee2();
		e2.setEid(2);
		e2.setEname("anchal");
		e2.setSalary(8000);
		
		employee2 e3 = new employee2();
		e3.setEid(3);
		e3.setEname("rahul");
		e3.setSalary(3000);
		
		employee2 e4 = new employee2();
		e4.setEid(4);
		e4.setEname("guddu");
		e4.setSalary(4500);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
	Collections.sort(list, new comparator2());
	
	for(employee2 m :list) {
		System.out.println("eid :"+m.getEid()+ " ename : "+m.getEname()+"salary : "+m.getSalary());
	}
		
	}
	

}
