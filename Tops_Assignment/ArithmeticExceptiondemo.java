package Tops_Assignment;

import java.util.Scanner;

public class ArithmeticExceptiondemo  {
	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");

		a = sc.nextInt();
		System.out.println("enter second number");
		b= sc.nextInt();
		
		try  {
			int c=a/b;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
