package topsclass_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student1 implements Serializable
{
	int rno;
	String sname;
	double per;
	
	student1(int rno,String sname,double per)
	{
		this.rno =rno;
		this.sname=sname;
		this.per=per;
	}

	@Override
	public String toString() {
		return "student1 [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}

	
	

	
	}
	
	
	
public class serialization {
	public static void main(String[] args) throws Exception {
		student1 s = new student1(1, "heer", 50.00);
		FileOutputStream fos = new FileOutputStream("tops");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		oos.flush();
		oos.close();
		
	System.out.println("session completed");
	
	FileInputStream fis = new FileInputStream("tops");
	ObjectInputStream ois = new ObjectInputStream(fis);
	student1 s2 =(student1) ois.readObject();
	ois.close();
	System.out.println(s2);
	
	}
	}

	
	


