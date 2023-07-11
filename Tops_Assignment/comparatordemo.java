package Tops_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparatordemo implements Comparator<Employee> {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list= new ArrayList<Employee>();
		
		Employee e1= new Employee();
		e1.setEid(1);
		e1.setEname("heer");
		e1.setSalary(8000);
		Employee e2= new Employee();
		e2.setEid(2);
		e2.setEname("anchal");
		e2.setSalary(12000);
		Employee e3= new Employee();
		e3.setEid(3);
		e3.setEname("shradha");
		e3.setSalary(2000);
		Employee e4= new Employee();
		e4.setEid(4);
		e4.setEname("guddu");
		e4.setSalary(9000);
		Employee e5= new Employee();
		e5.setEid(5);
		e5.setEname("jayshree");
		e5.setSalary(5000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list, new comparatordemo());
		
		System.out.println(list);
		
		/*
		 * for(Employee e:list) {
		 * System.out.println("Eid "+e.getEid()+"Ename "+e.getEname()+"Salary"+e.
		 * getSalary()); }
		 */
		
		
	}

	

	@Override
	public int compare(Employee e1, Employee e2) {
		
		int value =0;
		
		if(e1.getSalary()>e2.getSalary())
		{
			value=1;
		}
		else if(e1.getSalary()<e2.getSalary()) {
			value=-1;
		}
		else if(e1.getSalary()==e2.getSalary()) {
			value=0;
		}
		
		return value;
	}
	

}
