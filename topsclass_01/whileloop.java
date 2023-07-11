package topsclass_01;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] args) {
		long n, sum;
		sum = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		n= sc.nextInt();
//		while(n>0)
//		{
//			System.out.println("guddu");
//			n= n-1;
//		
//	}
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		while (n > 0) {
			sum = sum + n;
			n--;

		}
		System.out.println(sum);
	}
}
