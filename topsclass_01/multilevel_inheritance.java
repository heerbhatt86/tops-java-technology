package topsclass_01;

import java.util.Scanner;

class X
{
	Scanner sc = new Scanner(System.in);
	int a;
	void getA()
	{
		System.out.println("enter the value of a");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A"+a);
	}
	
}
class Y extends X
{
	int b;
	void getB()
	{
		System.out.println("enter the value of b");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B"+b);
	}
}
class z extends Y
{
	int c;
	void getC()
	{
		System.out.println("enter the value of c");
		c=sc.nextInt();
		
	}
	void putC()
	{
		System.out.println("C"+c);
	}
}

public class multilevel_inheritance {
	public static void main(String[] args) {
		z  z =new z();
		z.getA();
		z.getB();
		z.getC();
		z.putA();
		z.putB();
		z.putC();
	}
	
	

}
