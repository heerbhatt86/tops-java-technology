package topsclass_01;

import java.util.Scanner;

class A1 
{
	Scanner sc = new Scanner(System.in);
	int a;
	void getA()
	{
		System.out.println("enter a value");
		a= sc.nextInt();
	}
	void putA()
	{
		System.out.println("A"+a);
	}
}	
class B1 extends A1
{
	int b;
	void getB()
	{
		System.out.println("enter b value");
		b= sc.nextInt();
	}
	void putb()
	{
		System.out.println("B"+b);
	}
}
	class C1 extends A1
	{
		int c;
		void getC()
		{
			System.out.println("enter C value");
			c= sc.nextInt();
			
		}
		void putC()
		{
			System.out.println("c"+c);
		}
	}

	

public class hierachy_inheritance {
	public static void main(String[] args) {
		
		B1 b= new B1();
		C1 c =new C1();
		b.getA();
		b.getB();
		b.putA();
		b.putb();
		c.getA();
		c.putA();
		c.getC();
		c.putC();
		
	}

}
