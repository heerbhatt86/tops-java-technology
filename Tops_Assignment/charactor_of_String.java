package Tops_Assignment;

import java.util.Scanner;

public class charactor_of_String {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str;
		System.out.println("enter the String ");
		str=sc.nextLine();
		
		char ch[]= str.toCharArray();
		int letter=0,spaces=0,num=0,other=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				spaces++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else
			{
				other++;
			}
		}
		System.out.println(letter);
		System.out.println(spaces);
		System.out.println(num);
		System.out.println(other);
	}

}
