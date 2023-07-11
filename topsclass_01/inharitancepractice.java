package topsclass_01;

import java.util.Scanner;

class A {
	int a;
	Scanner sc = new Scanner(System.in);
	
	void geta() {
		System.out.println("put the value of A");
		a=sc.nextInt();
	}
	void puta() {
		
		System.out.println("A" + a);
	}
	
}
class B extends A
    
{
	 int b;
	void getb() {
		System.out.println("put value of B");
		b= sc.nextInt();
		
		
	}
	void putb() {
		System.out.println("B" + b);
	}
}
class C extends A{
	int c;
	
	void getc() {
		//Scanner sc =new Scanner(System.in);
		System.out.println("please enter C value");
		c= sc.nextInt();
	}
	void putc() {
		System.out.println("C" +":"+ c);
	}
}

public class inharitancepractice {
	public static void main(String[] args) {
		C C1 = new C();
		B b1 = new B();
		
		C1.geta();
		b1.geta();
		b1.getb();
		b1.geta();
		C1.getc();
		C1.puta();
		C1.putc();
		b1.puta();
		b1.putb();
		
		C1.putc();
	}

}
