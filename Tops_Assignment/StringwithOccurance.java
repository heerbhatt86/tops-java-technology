package Tops_Assignment;

import java.util.Arrays;

public class StringwithOccurance {
	public static void main(String[] args) {
		
		String str="opentext";
		
		char chartoreplce='t';
		
		
		char[] ch=str.toCharArray();
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]==chartoreplce)
			{
				ch[i]= String.valueOf(count).charAt(0);
				count++;
				
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
