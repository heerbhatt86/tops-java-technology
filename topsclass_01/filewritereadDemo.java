package topsclass_01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewritereadDemo {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("guddu.txt");
		String s1 = "aa meri jaannnnn";
		fw.write(s1);
		fw.flush();
		fw.close();
		System.out.println("tops technology");
		
		FileReader fr = new FileReader("guddu.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}

}
