package topsclass_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filemanagement {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("guddu.txt");
		String s = "wellcome to my world";
		byte b[]= s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("successfully written");
		
		FileInputStream fis = new FileInputStream("guddu.txt");
		int i;
		while ((i =fis.read())!=-1)
		{
			System.out.print((char)i);
			
		}
		fis.close();
		
		
		
		
		
		
	
		
		
		
		}
		
	}


