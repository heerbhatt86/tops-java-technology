package topsclass_01;

public class staticmethod {
	static int a=10;
	static int b;
	
	public staticmethod() {
		System.out.println("constructor");
	}
	{
		System.out.println("block 1");
	}
	
	static void display(int x) {
		System.out.println("value of x : "+ x);
		System.out.println("value of A : "+ a);
		System.out.println("value of B : "+ b);
	}
	{
		System.out.println("block 2");
	}
	static {
		System.out.println("static block");
		b=a*2;
	}
	
	
	
	public static void main(String[] args) {
		display(15);
		staticmethod s1 = new staticmethod();
		
		
	}
}
