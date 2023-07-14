package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Util.EmpUtil;
import com.bean.Emp;
import com.bean.EmpInfo;

public class EmpDo {
	public static void insertempinfo(EmpInfo e)
	{
		Session session=EmpUtil.creatsession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static void insertEmp(Emp e)
	{
		Session session=EmpUtil.creatsession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static List<Emp> getallemp()
	{
		Session session=EmpUtil.creatsession();
		List<Emp> list=session.createQuery("from Emp").list();
		session.close();
		return list;
	}
	public static Emp getemp(int eid)
	{
		Session session=EmpUtil.creatsession();
		Emp e=session.get(Emp.class, eid);
		session.close();
		return e;
		
		
	}
	public static void deleteemp(int eid)
	{
		Session session=EmpUtil.creatsession();
		Transaction tr=session.beginTransaction();
		Emp e=session.get(Emp.class, eid);
		session.delete(e);
		tr.commit();
		session.close();
	}

}
