package topsclass_01;

public class thisDemo {
	
	int rno;
	String name;
	
	public thisDemo() {
		System.out.println("default costructor");
	}
	
	public thisDemo(int rno,String name) {
		
		this();
		this.rno=rno;
		this.name=name;
		
		
	}
	void display() {
		System.out.println("roll number :" +rno );
		System.out.println("Name : "+name);
	}
	public static void main(String[] args) {
		thisDemo s1= new thisDemo(1, "heer");
		
		s1.display();
		
	}

}
