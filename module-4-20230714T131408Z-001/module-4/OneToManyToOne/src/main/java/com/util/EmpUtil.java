package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Dept;
import com.bean.Emp;

public class EmpUtil {
	
	public static Session creatsession()
	{
		SessionFactory sf=new Configuration()
				.addAnnotatedClass(Dept.class)
				.addAnnotatedClass(Emp.class)
				.configure()
				.buildSessionFactory();
		Session session=sf.openSession();
		return session;
	}

}
