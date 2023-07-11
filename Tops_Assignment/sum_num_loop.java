package Tops_Assignment;

import java.util.Scanner;

public class sum_num_loop {
	public static void main(String[] args) {
		
		
		int s=0;
		
		double avg=0;
		
		
		
		for(int i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			int m=sc.nextInt();
			s=s+m;
			avg=s/5;
			
			
			
		}
		System.out.println("sum of 5 number is "+s);
		System.out.println("average of 5 umber is "+avg);
		
	}

}
