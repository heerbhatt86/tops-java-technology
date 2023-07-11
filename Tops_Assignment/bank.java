package Tops_Assignment;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		 
		checkingaccount c= new checkingaccount(1, 1000);
		
		Scanner sc=new Scanner(System.in);
		double amount;
		
		while(true)
		{
			System.out.println("***************************");
			System.out.println(" 1. deposit");
			System.out.println("2 . withdraw");
			System.out.println("3. checkbalance");
			System.out.println("4.exit");
			System.out.println("*****************************");
			System.out.println("ENTER Your Choice : ");
			int choice=sc.nextInt();
			
			if (choice==1) {
				System.out.println("enter deposit Amount");
				amount=sc.nextDouble();
				c.diposit(amount);
				System.out.println("*****************");
				
				
			}
			else if (choice==2)
			{
				try {
				System.out.println("enter withdraw amount");
				amount=sc.nextDouble();
				c.withdraw(amount);
				}catch(Insufficientfund e) {
					System.out.println("sorry you need another "+e.getamount()+" RS. To Withdraw");
					
				}
				
			}
			else if(choice==3) {
				c.checkbalance();
			}
			else
			{
				System.out.println("Good Bye");
				break;
			}
		}
	}
}
