package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.EmpDo;
import com.bean.Emp;
import com.bean.EmpInfo;


@WebServlet("/Empcontroller")
public class Empcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("insert"))
		{
			EmpInfo einfo=new EmpInfo();
			einfo.setFname(request.getParameter("fname"));
			einfo.setLname(request.getParameter("lname"));
			einfo.setEmail(request.getParameter("email"));
			EmpDo.insertempinfo(einfo);
			
			Emp e=new Emp();
			e.setJob(request.getParameter("job"));
			e.setDept(request.getParameter("dept"));
			e.setEinfo(einfo);
			
			EmpDo.insertEmp(e);
			response.sendRedirect("show.jsp");
		}
		else if (action.equalsIgnoreCase("edit"))
		{
			int eid=Integer.parseInt(request.getParameter("eid"));
			Emp emp=EmpDo.getemp(eid);
			request.setAttribute("e", emp);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if (action.equalsIgnoreCase("update"))
		{
			EmpInfo einfo=new EmpInfo();
			einfo.setFname(request.getParameter("fname"));
			einfo.setLname(request.getParameter("lname"));
			einfo.setEmail(request.getParameter("email"));
			
			Emp e=new Emp();
			e.setEid(Integer.parseInt(request.getParameter("eid")));
			e.setJob(request.getParameter("job"));
			e.setDept(request.getParameter("dept"));
			e.setEinfo(einfo);
			EmpDo.insertEmp(e);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int eid=Integer.parseInt(request.getParameter("eid"));
			EmpDo.deleteemp(eid);
			response.sendRedirect("show.jsp");
			
		}
	}

}
