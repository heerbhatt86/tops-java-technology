package Tops_Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fileinputoutput {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("tops.txt");
		
		String s = "this is my java file";
		
		byte[] b=s.getBytes();
		
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("file write successfull");
		
		FileInputStream fis=new FileInputStream("tops.txt");
		
		
		
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
				
		
		
	}

}
