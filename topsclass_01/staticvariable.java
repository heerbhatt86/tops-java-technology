package topsclass_01;

import java.util.Scanner;





public class staticvariable {
	static int a;
	
	
	void setvalue(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of A");
		a =sc.nextInt();
		
		
	}
	void putvalue() {
		System.out.println("value of a :"+a);
	}
	
	
	
	public static void main(String[] args) {
		staticvariable s1= new staticvariable();
		staticvariable s2 = new staticvariable();
		staticvariable s3 = new staticvariable();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
		
		s1.putvalue();
		s2.putvalue();
		s3.putvalue();

		
	}

}
