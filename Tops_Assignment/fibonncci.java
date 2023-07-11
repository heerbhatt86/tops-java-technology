package Tops_Assignment;

import java.util.Scanner;

public class fibonncci {

	public static void main(String[] args) {
		
		int i,n,c;
		int a=0,b=1;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("enter your num");
		n=sc.nextInt();
		System.out.print(a+" "+b);
		for(i=1;i<=n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
		
	}
}
