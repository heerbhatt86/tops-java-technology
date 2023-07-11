package Tops_Assignment;

import java.sql.Array;
import java.util.Scanner;

public class multipalcatchblock {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a,b,c;
	try {	
		System.out.println("Enter the first value");
		
		a= sc.nextInt();
		
		System.out.println("enter the second value");
		
		b= sc.nextInt();
		
	
		
		int [] marks= new int[3];
		
		marks[0]=12;
		marks[1]=45;
		marks[2]=13;
		System.out.println("enter index number");
		int index= sc.nextInt();
		
		System.out.println(marks[index]);
		c=a/b;
	}
	catch (ArithmeticException e) {
		System.out.println(e);
	}
	catch (IndexOutOfBoundsException e) {
		System.out.println(e);
	}
	{
		
	}
		
		
		
		
		
		
		
	}

}
