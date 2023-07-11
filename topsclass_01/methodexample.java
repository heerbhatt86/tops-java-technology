package topsclass_01;

public class methodexample 
{
	
	int studentrno;
	String studentname;
	String studentcity;
	
	
	
	public void study()
	{
		
		System.out.println("student is studing"+studentname);
	}
	public void fulldetails()
	{
		System.out.println("student ro number is "+studentrno);
		System.out.println("studentname is "+studentname);
		System.out.println("student city is "+studentcity);
		
	}
public static void main(String[] args) {
	 
	 methodexample	st1 = new methodexample();
	
	st1.studentrno =45;
	st1.studentname= "guddu";
	st1.studentcity = "gozariya";
	st1.fulldetails();
	
	st1.study();
    
	
	
	
	
	
	
}
}
