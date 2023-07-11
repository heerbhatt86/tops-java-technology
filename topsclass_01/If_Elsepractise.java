package topsclass_01;

import java.util.Scanner;

public class If_Elsepractise {

	public static void main(String[] args) {
		/*
		 * System.out.println("please enter number"); Scanner sc = new Scanner
		 * (System.in);
		 * 
		 * int a= sc.nextInt();
		 * 
		 * if(a%2==0) { System.out.println("even"); } else { System.out.println("odd");
		 * }
		 */
		/*
		 * int a, b, c;
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("enter the value of A"); a = sc.nextInt();
		 * System.out.println("enter the value of B"); b= sc.nextInt();
		 * System.out.println("enter the value of C"); c= sc.nextInt();
		 * 
		 * if(a>b) { if(a>c) { System.out.println("a is grater"); } } else if (b>c) {
		 * System.out.println("b is grater"); } else {
		 * System.out.println("c is grater"); }
		 */
		
		/*
		 * int sno,s1,s2,s3; String sname; float per;
		 * 
		 * Scanner sc = new Scanner (System.in); System.out.println("enter your name ");
		 * 
		 * sname= sc.next(); System.out.println("enter your roll number"); sno =
		 * sc.nextInt();
		 * 
		 * System.out.println("enter s1 marks "); s1= sc.nextInt();
		 * System.out.println("enter s2 marks"); s2 = sc.nextInt();
		 * System.out.println("enter s3 marks"); s3= sc.nextInt(); int total=s1+s2+s3;
		 * per = total/3; System.out.println("name"+sname+" "+ per);
		 * 
		 * if(per>=80) { System.out.println("first class"); } else if(per>=60){
		 * System.out.println("second class");
		 * 
		 * } else if (per>=50) { System.out.println("pass class"); } else {
		 * System.out.println("fail"); }
		 */
		
		/*
		 * int i,n,sum=0; Scanner sc = new Scanner(System.in);
		 * System.out.println("enter N num"); n = sc.nextInt();
		 * 
		 * for(i=1;i<=n;i++) { sum= sum+i; } System.out.println("sum :"+ sum);
		 * 
		 * 
		 */
		
		//pattern question
		
		/*int i,j,k;
		
		for (i=0;i<10;i++)
		{
			for(k=0;k<10-i;k++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
			System.out.print(" *");
		}
			System.out.println(" ");
		
		
		
		
		}

	*/
		//arry*
		
		int a[]=new int[5];
		int i,j,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements ");
		
		
		for (i=0;i<a.length;i++)
		{
		System.out.println("enter " + i +" element: ");
		a[i]=sc.nextInt();
		} 
		for(i=0;i<a.length;i++)
		{
			System.out.println("A[" +i+"]="+ a[i]);
		}
		for (i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
		
		if(a[i]>a[j]) {
			temp= a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
		
		{
			
		
		
		
		
	}}}
		System.out.println("i asceding order");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A[" +i+"]="+ a[i]);
		}
		
	}}

