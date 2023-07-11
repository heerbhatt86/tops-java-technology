package Tops_Assignment;

class newthread implements Runnable{
	
	Thread t;
	
	public newthread() {
		t= new Thread(this,"child thread");
		t.start();
	}
	
public void run() {
	
	for(int i=0;i<5;i++)
	{
		System.out.println(t + " "+ i);
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	System.out.println("child thread exit");
		
		
	}
	
	
}
public class threadInterface {
	
	public static void main(String[] args) throws Exception {
		new newthread();
		
		Thread t=Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println(t+ " : " +i);
			t.sleep(3000);
		}
		System.out.println("main thread exit");
		
	}

}
