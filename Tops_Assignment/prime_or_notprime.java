package Tops_Assignment;

import java.util.Scanner;

public class prime_or_notprime {

	public static void main(String[] args) {

		int i, n;
		int temp = 0;
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number");
		n = sc.nextInt();
		for (i = 3; i <= n / 2; i++) {
			if (n % i == 0) {
				flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		
	}
}
