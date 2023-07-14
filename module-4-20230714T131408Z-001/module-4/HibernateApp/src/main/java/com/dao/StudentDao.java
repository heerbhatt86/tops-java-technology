package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bin.Student;
import com.util.StudentUtil;

public class StudentDao {
	public static void insertstudent(Student s)
	{
		Session session=StudentUtil.createSession();
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(s);
		transaction.commit();
		session.close();
	}
	public static List<Student> getallstudent()
	{
		Session session=StudentUtil.createSession();
		List<Student> list=session.createQuery("from Student").list();
		session.close();
		return list;
	}
	public static Student getstudent(int id)
	{
		Session session=StudentUtil.createSession();
		Student student=session.get(Student.class, id);
		return student;
	}
	public static void deletestudent(int id)
	{
		Session session=StudentUtil.createSession();
		Transaction transaction=session.beginTransaction();
		Student student=session.get(Student.class, id);
		session.delete(student);
		transaction.commit();
		session.close();
		
	}

}
