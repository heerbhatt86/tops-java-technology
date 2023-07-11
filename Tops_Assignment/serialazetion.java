package Tops_Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student1 implements Serializable{
	
	int rno;
	String name;
	double per;
	public student1(int rno, String name, double per) {
		
		this.rno = rno;
		this.name = name;
		this.per = per;
		
		
	}
	
	public String toString() {
		return "student1 rno=" + rno + ", name=" + name + ", per=" + per ;
	}
	
	
	
	
}

public class serialazetion {
	public static void main(String[] args)throws Exception {
		student1 s=new student1(1, "heer", 65.45);
		
		
		
		FileOutputStream fos=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		System.out.println("object return successfully");
		
		
		FileInputStream fis= new FileInputStream("ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		student1 s1=(student1)ois.readObject();
		ois.close();
		System.out.println(s1);
		
		
	}
	
	
	
	
	

}
