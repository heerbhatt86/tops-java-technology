package topsclass_01;

class guddu
{
	 void show()
	{
		System.out.println("first method");
	}
}

class guru extends  guddu

{
	void show()
	{
		super.show();
		System.out.println("second method" );
	}
}


 
public class finalkeyword {
	public static void main(String[] args) {
		guru g = new guru();
		g.show();
	}
 
	
}
