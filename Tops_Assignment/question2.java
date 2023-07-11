package Tops_Assignment;

import java.util.Scanner;

public class question2 {
//WJP take three number and print the greatest number
	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		a=sc.nextInt();
		System.out.println("enter second value");
		b=sc.nextInt();
		System.out.println("enter third value");
		c=sc.nextInt();
		
		if(a>b) {
			
			if(a>c)
			{
				System.out.println("a is grater");
				System.out.println(a);
			}
		}
		else if(b>c) {
			System.out.println("b is grater");
			System.out.println(b);
		}
		else {
			System.out.println("c is grater");
			System.out.println(c);
		}
	}
}
