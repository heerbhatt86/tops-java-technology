package topsclass_01;

class base
{
	void run()
	{
		System.out.println("keep running");
	}
	void run(int a)
	{
		System.out.println("KM"+a);
	}
}
class direvied extends base
{
	void run(int a,int b,int c)
	{
		System.out.println("value"+a + b + c);
	}
	
}

public class methodoverloading_in_inheritance {
	public static void main(String[] args) {
		direvied d = new direvied();
		d.run();
		d.run(0);
		d.run(1, 2, 3);
	}
	

}
