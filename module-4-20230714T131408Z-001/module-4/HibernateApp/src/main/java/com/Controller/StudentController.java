package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bin.Student;
import com.dao.StudentDao;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String action=request.getParameter("action");
		if(action.equalsIgnoreCase("insert"))
			
		{
			Student student =new Student();
			student.setFname(request.getParameter("fname"));
			student.setLname(request.getParameter("lname"));
			student.setEmail(request.getParameter("email"));
			student.setMobile(request.getParameter("mobile"));
			StudentDao.insertstudent(student);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			Student student=StudentDao.getstudent(id);
			request.setAttribute("s", student);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update"))
		{
			Student student=new Student();
			student.setId(Integer.parseInt(request.getParameter("id")));
			student.setFname(request.getParameter("fname"));
			student.setLname(request.getParameter("lname"));
			student.setEmail(request.getParameter("email"));
			student.setMobile(request.getParameter("mobile"));
			StudentDao.insertstudent(student);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			StudentDao.deletestudent(id);
			response.sendRedirect("show.jsp");
		}
		
		
	}

}
