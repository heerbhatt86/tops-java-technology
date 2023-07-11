package Tops_Assignment;

public class Insufficientfund extends Exception {
			
	double amount;

	public Insufficientfund(double amount) {
		
		this.amount = amount;
	}
	
	public double getamount() {
		return this.amount;
	}
	

}
