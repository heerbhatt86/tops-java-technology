package Tops_Assignment;

public class Factorial_number {
	
	static int factorial(int n){
		int i;
		int fact=1;
		
		for(i=1;i<=n;i++) {
			fact =fact*i;
			
		}
		return fact;
		
	}

	public static void main(String[] args) {
		
		
		System.out.println("factorila of a num is ="+ factorial(4));
	}
}
