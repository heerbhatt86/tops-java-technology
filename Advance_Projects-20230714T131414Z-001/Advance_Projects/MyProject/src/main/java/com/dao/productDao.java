package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Util.UserUtil;
import com.bean.product;

public class productDao {
	public static void addproduct(product p) 
	{
	try {
		Connection conn=UserUtil.createcConnection();
		String sql="insert into product (product_category,product_name,product_price,product_desc,product_image,uid) values(?,?,?,?,?,?)";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1,p.getProduct_category());
		pst.setString(2, p.getProduct_name());
		pst.setInt(3, p.getProduct_price());
		pst.setString(4, p.getProduct_desc());
		pst.setString(5, p.getProduct_image());
		pst.setInt(6, p.getUid());
		pst.executeUpdate();
		
	} catch (Exception e) {
	e.printStackTrace();
	}	
		
	}
	public static List<product> getallproduct(int uid)
	{
		List<product> list= new ArrayList<>();
		try {
			Connection connection =UserUtil.createcConnection();
			String sql="select * from product where uid=?";
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				product p =new product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_price(rs.getInt("product_price"));
				list.add(p);
				
			}
		} catch (Exception e) {
		e.printStackTrace();	
		}
		return list;
	}
	
	public static List<product> getallproduct()
	{
		List<product> list= new ArrayList<>();
		try {
			Connection connection =UserUtil.createcConnection();
			String sql="select * from product";
			PreparedStatement pst=connection.prepareStatement(sql);
			
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				product p =new product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_price(rs.getInt("product_price"));
				list.add(p);
				
			}
		} catch (Exception e) {
		e.printStackTrace();	
		}
		return list;
	}
	public static product getproduct(int pid)
	{
		product p = null;
		try {
			Connection connection =UserUtil.createcConnection();
			String sql="select * from product where pid=?";
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				 p =new product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_price(rs.getInt("product_price"));
				
			}
		} catch (Exception e) {
		e.printStackTrace();	
		}
		return p;
	}


}
