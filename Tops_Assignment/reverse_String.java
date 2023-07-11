package Tops_Assignment;

public class reverse_String {

	public static void main(String[] args) {
		
		String str="hello";
		
		char[] ch=str.toCharArray();
		
		for (int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
