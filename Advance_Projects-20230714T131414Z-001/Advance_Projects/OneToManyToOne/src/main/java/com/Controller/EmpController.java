package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Dept;
import com.bean.Emp;
import com.dao.EmpDao;


@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert dept"))
		{
			Dept dept =new Dept();
			dept.setDname(request.getParameter("dname"));
			dept.setLoc(request.getParameter("loc"));
			EmpDao.insertDept(dept);
			response.sendRedirect("Dept.jsp");
		}
		if(action.equalsIgnoreCase("insert emp"))
		{
			int did=Integer.parseInt(request.getParameter("dept"));
			Dept dept=EmpDao.getdept(did);
			
			Emp e= new Emp();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setDept(dept);
			EmpDao.insertEmp(e);
			response.sendRedirect("Emp.jsp");
		}
	}

}
