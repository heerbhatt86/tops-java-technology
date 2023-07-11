package topsclass_01;


class callback {
	public void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("]");
		
	}
}

	class caller implements Runnable {
		Thread t;
		String msg;
		callback c;

		public caller(String msg, callback c) {

			this.msg = msg;
			this.c = c;
			
			t =new Thread(this);
			t.start();

		}

		public void run() {
			
			
 synchronized(c)
 {
	 c.call(msg);
 }

			

		}

	}


public class synchronization_Thread {
	public static void main(String[] args) {
		callback c = new callback();
		caller c1 = new caller("heer",c);
		caller c2 = new caller("guru",c);
		caller c3 = new caller("guddu",c);
		
		
		
		
	}

}
