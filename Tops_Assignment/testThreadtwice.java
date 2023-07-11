package Tops_Assignment;

class testThread extends  Thread {

	

	public void run() {
		System.out.println("runnig");

	}

}

public class testThreadtwice {
	public static void main(String[] args) {
		Thread t= new Thread();
		

		testThread t1 = new testThread();
		t1.start();
		t1.start();
		
	}
	
	

}
