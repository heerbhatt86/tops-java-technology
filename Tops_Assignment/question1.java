package Tops_Assignment;

import java.util.Scanner;

public class question1 {
	//*find the factorial of n number
	
	public static void printfactorial(int n)
	{
		
		if(n<0) {
			System.out.println("invalid number");
			return;
		}
		int factorial=1;

		for(int i=n;i>=1;i--)
		{
			factorial*=i;
		}
		System.out.println(factorial);
		return;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		printfactorial(n);
	}
}
