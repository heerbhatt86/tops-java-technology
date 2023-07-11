package topsclass_01;

import java.util.Scanner;

public class array2d {
	
	public static void main(String[] args) {
		int a[][]= new int[3][3];
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2d arry");
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.println("enter "+i+"row &"+j+"column :");
				a[i][j]=sc.nextInt();
				
				
				
			}
		}
		System.out.println("2D array is ");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.println("A["+i+"]["+j+"]= "+a[i][j]);
			}
		}
	
		
		
	}
	
	

}
