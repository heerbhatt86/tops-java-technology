package Tops_Assignment;

import java.util.Scanner;

public class diviseble_by {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num :");
		int  a=sc.nextInt();
		
		if(a>0&& a<=100)
		{
			for(int i=0;i<=a;i++) {
				if(i%3==0 && i%5==0) {
					
					System.out.println(i);
					
				}
				
				
			}
		}
		else 
		{
			System.out.println("please enter num between 1 to 100");
		}
	}

}
