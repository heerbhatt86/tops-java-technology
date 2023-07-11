package Tops_Assignment;

public class voteexception {

	public static int validate(int age) {
		if (age >= 18) {

			System.out.println("wellcome to  vote");

		} else {
			throw new ArithmeticException();

		}
		
		return age;
	}
	
	public static void main(String[] args) {
		
		
		validate(18);
	}

}
