package topsclass_01;

import java.util.Scanner;

public class swichcase {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of A");
		a= sc.nextInt();
		
		System.out.println("enter the value of B");
		b= sc.nextInt();
		System.out.println(" 1 .additon");
		System.out.println("2 . subtraction");
		System.out.println("3 . multiplication");
		System.out.println("4 . division");
		System.out.println("enter your choice : ");
		d= sc.nextInt();
		
		switch(d)
		{
		case 1: 
		  c= a+b;
		  System.out.println(c);
		  break;
		case 2:
			c= a-b;
			System.out.println(c);
			break;
		case 3:
			c= a*b;
			System.out.println(c);
			break;
		case 4:
			c= a/b;
			System.out.println(c);
//			break;
//			default:
//				System.out.println("invalid choice");
//				break;
		
		}
		
	}

}
