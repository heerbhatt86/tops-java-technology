package Tops_Assignment;

public class String_startswith {
	
	public static void main(String[] args) {
		
		String s1="Red is my favorite color";
		String s2="orange is my favorite color";
		
		String str="Red";
		
		boolean str1=s1.startsWith(str);
		boolean str2=s2.startsWith(str);
		System.out.println(str1);
		System.out.println(str2);
	}

}
