package Tops_Assignment;

import java.util.Scanner;

public class max_min_value {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("index size :" );
		int size= sc.nextInt();
		
		int num[]=new int [size];
		
		for( int i=0;i<size;i++)
		{
			
			num[i]= sc.nextInt();
			System.out.println("numbers"+i+"value");
			
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("print largest num : "+max);
		System.out.println("print lowest num : "+min);
	}
	

}
