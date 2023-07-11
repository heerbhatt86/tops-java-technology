package Tops_Assignment;


class newthread1 extends Thread{
	
	
	public newthread1() {
		
		 new Thread("child thread");
		// start();
		
	}
	
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println(this+ " "+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("child thread exit");
		
		
		
	}
	
}

public class threadbythreadclass {
	public static void main(String[] args) throws Exception {
		
		newthread1 t1= new newthread1();
		t1.start();
		
		//new newthread1();
		
		Thread t= Thread.currentThread();
		for(int i=0;i<5;i++) {
			System.out.println(t+" "+i);
			t.sleep(2000);
			
		}
		System.out.println("main thread exit");
	}

	
}
