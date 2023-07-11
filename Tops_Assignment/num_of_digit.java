package Tops_Assignment;

public class num_of_digit {
	public static void main(String[] args) {
		int n;
		n=125000;
		int count=0;
		
		while(n!=0)
		{
			n/=10;
			count++;
			
		}
		System.out.println(count);
	}

	
}
