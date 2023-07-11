package Tops_Assignment;

import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String c=sc.next();
		
		if(c.equals("a")||c.equals("e")|| c.equals("i")|| c.equals("o")|| c.equals("u"))
		{
			System.out.println("it is a vowle = "+c);
		}
		else if(c.length()>1)
		{
			System.out.println("error. not a letter");
		}
		
		else 
		{
			System.out.println("charecter is constent = " +c);
		}
			
		
	}

}
