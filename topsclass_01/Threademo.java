package topsclass_01;

public class Threademo {
	public static void main(String[] args) throws Exception {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("guru");
		System.out.println(t);
		t.setPriority(2);
		System.out.println(t);
		for(int j=0;j<5;j++)
		{
			System.out.println(t+ " :" +j);
			Thread.sleep(1000);
		}
	}

	

}
