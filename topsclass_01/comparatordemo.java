package topsclass_01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class comparatordemo implements Comparator<employee>{

	
	public int compare(employee e1, employee e2) {
		
		int value =0;
		
		if ( e1.getSalary() > e2.getSalary())
		{
			value = 1;
		}
		else if (e1.getSalary()< e2.getSalary())
		{
			value = -1;
		}
		else if (e1.getSalary()== e2.getSalary())
		{
			value =0;
		}
			
		
		return value;
	}
	
public static void main(String[] args) {
	ArrayList<employee>  list =new ArrayList<employee>();
	
	
	employee e1 = new employee();
	e1.setEid(1);
	e1.setEname("shraddha");
	e1.setSalary(1000);
	
	employee e2 = new employee();
	e2.setEid(2);
	e2.setEname("guru");
	e2.setSalary(150000);
	
	employee e3 = new employee();
	e3.setEid(3);
	e3.setEname("anchal");
	e3.setSalary(15000);
	
	employee e4 = new employee();
	e4.setEid(4);
	e4.setEname("guddu");
	e4.setSalary(20000);
	
	employee e5 = new employee();
	e5.setEid(5);
	e5.setEname("munni");
	e5.setSalary(18000);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);
	
	
	
	
	Collections.sort(list, new comparatordemo());
	
	
	
	for(employee q :list)
	{
		System.out.println("eid "+ q.eid +"  ename " + q.ename + "  salary "+ q.salary);
	}
	
	
	{
		
	}
	
}
}

