package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Dept;
import com.bean.Emp;
import com.util.EmpUtil;

public class EmpDao {
	public static void insertDept(Dept d)
	{
		Session session=EmpUtil.creatsession();
		Transaction tr=session.beginTransaction();
		session.save(d);
		tr.commit();
		session.close();
	}
	public static List<Dept> getallDepts()
	{
		Session session=EmpUtil.creatsession();
		List<Dept> list=session.createQuery("from Dept").list();
		session.close();
		return list;
	}
	
	public static void insertEmp(Emp e)
	{
		Session session=EmpUtil.creatsession();
		Transaction tr=session.beginTransaction();
		session.save(e);
		tr.commit();
		session.close();
	}
	public static Dept getdept(int did)
	{
		Session session=EmpUtil.creatsession();
		Dept d=session.get(Dept.class, did);
		session.close();
		return d;
	}

}
