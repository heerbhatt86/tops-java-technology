package topsclass_01;

import java.util.Scanner;

class A2
{
	int a;
	Scanner sc =new Scanner(System.in);
	void getA()
	{
		
		System.out.println("put the value of a");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A"+a);
	}
	 
	
}
class b2 extends A2
{
	int b;
	void getB()
	{
		System.out.println("put the value of b");
		
		b= sc.nextInt();
	}
	void putb()
	{
		System.out.println("B"+b);
	}
	
}
public class inheritance {
	
	public static void main(String[] args) {
	b2 b1= new b2();
	b1.getA();
	b1.getB();
	b1.putA();
	b1.putb();
	
	}
	
	
	

}
