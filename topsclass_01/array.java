package topsclass_01;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		int a[] = new int[5];
		int i, j, temp;
		Scanner sc = new Scanner(System.in);

		for (i = 0; i < a.length; i++) {
			System.out.println("enter  " + (i + 1) + " element:");
			a[i] = sc.nextInt();

		}
		for (i = 0; i < a.length; i++) {
			System.out.println("A[" + i + "] = " + a[i]);
		}
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("array Elements are in asceding order");
		for (i = 0; i < a.length; i++) {
			System.out.println("A [" + i + "] = " + a[i]);

		}
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
				
			}
		}
		System.out.println("arry element are in decending order");
		for (i = 0; i < a.length; i++) {
			System.out.println("A[" + i + "] = " + a[i]);
		}
	}

}
