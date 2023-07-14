package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Util.UserUtil;
import com.bean.User;

public class UserDao {
	
	public static void registerUser(User u) {
		try {
			Connection conn= UserUtil.createcConnection();
			String sql = "insert into user(fname,lname,email,mobile,address,password,usertype)values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getMobile());
			pst.setString(5, u.getAddress());
			pst.setString(6, u.getPassword());
			pst.setString(7, u.getUsertype());
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection conn = UserUtil.createcConnection();
			String sql = "select * from user where email=?";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs= pst.executeQuery();
			if (rs.next())
			{
				flag =true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	public static User login(String email) {
		User u= null;
		try {
			Connection conn = UserUtil.createcConnection();
			String sql = "select * from user where email=?";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs= pst.executeQuery();
			if (rs.next())
			{
				u=new User();
				u.setUid(rs.getInt("uid"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setMobile(rs.getString("mobile"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
				u.setUsertype(rs.getString("usertype"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return u;
	}
	public static void changepassword(String email,String password)
	{
		try {
			Connection connection =UserUtil.createcConnection();
			String sql="update user set password=? where email=?";
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setString(1, password);
			pst.setString(2, email);
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
