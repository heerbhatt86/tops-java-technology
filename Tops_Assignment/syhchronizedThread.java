package Tops_Assignment;

class caller{
	
	public void call(String msg) {
		System.out.print("[" +msg);
	     try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	     System.out.print("]");
		
		
		
	}
}
class callback implements Runnable{
	Thread t;
	String msg;
	caller c;
	
	public callback(String msg,caller c) {
		this.c=c;
		this.msg=msg;
		
		t= new Thread(this);
		
		t.start();
	}

	
	public void run() {
		synchronized (c) {
			
			c.call(msg);
			
		}
		
	}
	
}

public class syhchronizedThread {
	public static void main(String[] args) {
		
		caller c1= new caller();
		callback c2= new  callback("heer", c1);
		callback c3= new  callback("bhatt", c1);
		callback c4= new  callback("java", c1);
		
		
	}
	

}
