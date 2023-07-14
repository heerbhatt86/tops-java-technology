package com.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.User;
import com.bean.cart;
import com.bean.wishlist;
import com.dao.UserDao;
import com.dao.cartdao;
import com.dao.wishlistdao;
import com.service.Services;


@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("register")) {
			boolean flag = UserDao.checkEmail(request.getParameter("email"));
			if(flag==false) {
				if(request.getParameter("password").equals(request.getParameter("cpassword"))) {
					User u = new User();
					u.setFname(request.getParameter("fname"));
					u.setLname(request.getParameter("lname"));
					u.setEmail(request.getParameter("email"));
					u.setMobile(request.getParameter("mobile"));
					u.setAddress(request.getParameter("address"));
					u.setPassword(request.getParameter("password"));
					u.setUsertype(request.getParameter("usertype"));
					UserDao.registerUser(u);
					request.setAttribute("msg", "User Registered Successfully");
					request.getRequestDispatcher("register.jsp").forward(request, response);
					
				}
				else {
					request.setAttribute("msg", "Password & Confirm Password does Not Matched ");
					request.getRequestDispatcher("register.jsp").forward(request, response);
					
				}
			}
			else {
				request.setAttribute("msg", "Email already Registered ");
				request.getRequestDispatcher("register.jsp").forward(request, response);
				
			}
			
			
		}
		else if(action.equalsIgnoreCase("login")) {
			User u=UserDao.login(request.getParameter("email"));
			if(u!=null)
			{
				if(u.getPassword().equals(request.getParameter("password"))) 
				{
					if(u.getUsertype().equals("buyer"))
					{
					HttpSession session =request.getSession();
					session.setAttribute("u", u);
					List<wishlist> list =wishlistdao.getwishlistbyuser(u.getUid());
					session.setAttribute("wishlist_count", list.size());
					List<cart> list1= cartdao.getcartbyuser(u.getUid());
					session.setAttribute("cart_count", list1.size());
					
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
					else {
						HttpSession session =request.getSession();
						session.setAttribute("u", u);
						request.getRequestDispatcher("seller-index.jsp").forward(request, response);

						
					}
						
					}
					
				else
				{
					request.setAttribute("msg", "Incorrect Password ");
					request.getRequestDispatcher("login.jsp").forward(request, response);
					
				}
			}
			else {
				request.setAttribute("msg", "Email Not Register ");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}
		}
		else if(action.equalsIgnoreCase("change password"))
		{
			HttpSession session = request.getSession();
			User user=(User)session.getAttribute("u");
			
			if(user.getPassword().equals(request.getParameter("old_password"))) 
			{
				if(request.getParameter("new_password").equals(request.getParameter("cnew_password")))
				{
					UserDao.changepassword(user.getEmail(), request.getParameter("new_password"));
					response.sendRedirect("logout.jsp");
				}
			
			else 
			{
				if(user.getUsertype().equals("buyer"))
				{
				request.setAttribute("msg", "New Password & Confirm Password does not match ");
				request.getRequestDispatcher("change-password.jsp").forward(request, response);
			}
				else {
					request.setAttribute("msg", "New Password & Confirm Password does not match ");
					request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
					
				}
					
				}
			}
			else
			{
				if(user.getUsertype().equals("buyer"))
				{
				request.setAttribute("msg", "Old Password does not match ");
				request.getRequestDispatcher("change-password.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Old Password does not match ");
					request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
					
				}
			}
			
			}
		else if (action.equalsIgnoreCase("forgot password"))
		{
			boolean flag= UserDao.checkEmail(request.getParameter("email"));
			if(flag==true)
			{
				Random t = new Random();
		    	int minRange = 1000, maxRange= 9999;
	        	int otp = t.nextInt(maxRange - minRange) + minRange;
	        	Services.sendMail(request.getParameter("email"), otp);
	        	request.setAttribute("email", request.getParameter("email"));
	        	request.setAttribute("otp", otp);
	        	request.getRequestDispatcher("otp.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Email not registered ");
				request.getRequestDispatcher("forgetpass.jsp").forward(request, response);
				
			}
		}
		else if(action.equalsIgnoreCase("verify otp"))
		{
			String email=request.getParameter("email");
			int otp = Integer.parseInt(request.getParameter("otp"));
			int uotp = Integer.parseInt(request.getParameter("uotp"));
			if(otp==uotp)
			{
				request.setAttribute("email", email);
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Invalid OTP");
				request.setAttribute("email", email);
	        	request.setAttribute("otp", otp);
				request.getRequestDispatcher("otp.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update password"))
		{
			String email=request.getParameter("email");
			String np = request.getParameter("new_password");
			String cnp=request.getParameter("cnew_password");
			
			if(np.equals(cnp)) 
			{
				UserDao.changepassword(email, np);
				request.setAttribute("msg", "password updated successfully");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "new password & confirm new password does not match");
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			}
		}
			
	
			
		}
	}


