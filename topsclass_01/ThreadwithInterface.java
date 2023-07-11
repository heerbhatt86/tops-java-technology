package topsclass_01;

class newthread implements Runnable {
	
	Thread t;
	
	public newthread() {
		
		
	t= new Thread(this,"child Thread");
	t.start();
	
		
	}

	
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println(t + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("exit child Thread");
		
		
		
	}
	
}

public class ThreadwithInterface {
	public static void main(String[] args) throws Exception {
		new newthread();
		
		Thread t = Thread.currentThread();
		System.out.println("current Thread");
		for( int j=0;j<5;j++)
		{
			System.out.println(t+ ":" +j);
			Thread.sleep(2000);
		}
		
		System.out.println("exit from currentThread");
		
	}
	

}
