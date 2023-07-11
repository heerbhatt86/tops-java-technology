package Tops_Assignment;

import java.util.Scanner;

public class function {
	public static void main(String[] args) {
		int ans =sum1();
		System.out.println(ans);
		
		
		
	}
	
	static int sum1()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number  A: ");
		int a= sc.nextInt();
		System.out.println("enter number B: ");
		int b= sc.nextInt();
		int sum=a+b;
		return sum;
		
		
	}

}
