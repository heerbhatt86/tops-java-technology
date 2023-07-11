package Tops_Assignment;

public class checkingaccount {
	
	int ano;
	double balance;
	public checkingaccount(int ano, double balance) {
		
		this.ano = ano;
		this.balance = balance;
	}
	
	public void diposit(double amount) {
		this.balance=this.balance+ amount;
		
	}
	public void withdraw(double amount) throws Insufficientfund{
		if(amount<=this.balance)
		{
			this.balance=this.balance-amount;
			
		}
		else
			
		{
			double needs=amount-this.balance;
			throw new Insufficientfund(needs);
		}
	}
	public void checkbalance()
	{
		System.out.println("current balance is : "+this.balance);
	}
	

}
