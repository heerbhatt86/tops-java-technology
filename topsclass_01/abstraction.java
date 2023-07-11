package topsclass_01;


 abstract class  abc
{
	void meth1()
	{
		System.out.println("normal method");
	}
	abstract void  meth2();
}
 class abc2 extends abc
 {
	 void meth2()
	 {
		 System.out.println("abstract method");
	 }
 }

public class abstraction {
	public static void main(String[] args) {
		abc2 a = new abc2();
		a.meth1();
		a.meth2();
	}
	
	

}
