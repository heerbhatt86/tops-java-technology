package Tops_Assignment;

public class student {

	int rno;
	int age;
	String name;
	String cource;
	public student(int rno, int age, String name, String cource) {
		
		this.rno = rno;
		this.age = age;
		this.name = name;
		this.cource = cource;
		
		
		try {
			
			if(age>=15&&age<=21)
			{
				System.out.println("age is within the range");
			}
			else throw new ageisnotwithinrangeExcetion();
			
		} catch (ageisnotwithinrangeExcetion e) {
			
			System.out.println(e);
			
		}
		
		
		
		
		for(int i=0;i<name.length();i++) {
			char ch;
			ch=name.charAt(i);
			
			if (ch<'A'||ch>'Z'&& ch<'a'||ch>'z')
			{
				
			}
			
		}
		
	}
	
	
	
	
	
	
	
	}
	
	

