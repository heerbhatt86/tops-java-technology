package topsclass_01;
class red
{
	void get()
	{
		System.out.println("gettig");
	}
	
}
class pink extends red
{
	void get()
	{
		super.get();
		System.out.println("not getting");
	}
}



public class methodoverrideing_in_inharitance {

	public static void main(String[] args) {
		pink p = new pink();
		p.get();
	}
}
