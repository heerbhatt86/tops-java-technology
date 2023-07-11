package topsclass_01;

import java.util.Scanner;

public class Constructoexample {
	int srno;
	String sname;
	int s1,s2,s3;
	float per;
	
	Constructoexample()	
	{
		System.out.println("wellcome");
	}
	Constructoexample(int s1,int s2,int s3)
	
	{
		System.out.println(" sub 1 marks"+s1);
		System.out.println(" sub 2 marks"+s2);
		System.out.println(" sub 3 marks"+s3);
	}
	public void student( String sname, int srno)
	{
		System.out.println("student name"+sname);
		System.out.println("student rno"+srno);
		
		
		
	}
	public static void main(String[] args) {
		String b;
		int u;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student name");
		b= sc.next();
		System.out.println("enter roll no");
		u=sc.nextInt();
		Constructoexample c =new Constructoexample();
		Constructoexample c1 = new Constructoexample(45,78,56);
		
		c1.student(b,u);
		
		
		
	}

		
}
