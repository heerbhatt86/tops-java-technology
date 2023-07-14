package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Util.UserUtil;
import com.bean.Contact;

public class ContactDao {
	
	public static void submitContact(Contact c)
	{
		try {
			Connection conn= UserUtil.createcConnection();
			String sql="insert into contact (name,email,subject,remarks) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getName());
			pst.setString(2, c.getEmail());
			pst.setString(3,c.getSubject());
			pst.setString(4, c.getRemarks());
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
