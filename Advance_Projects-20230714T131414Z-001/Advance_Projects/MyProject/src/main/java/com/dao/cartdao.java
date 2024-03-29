package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Util.UserUtil;
import com.bean.cart;
import com.bean.wishlist;

public class cartdao {

	public static void addtocart(cart c)
	{
	try {
		Connection conn = UserUtil.createcConnection();
		String sql ="insert into cart(pid,uid,product_price,product_qty,total_price,payment_status) values (?,?,?,?,?,?)";
		PreparedStatement pst =conn.prepareStatement(sql);
		pst.setInt(1, c.getPid());
		pst.setInt(2, c.getUid());
		pst.setInt(3, c.getProduct_price());
		pst.setInt(4, c.getProduct_qty());
		pst.setInt(5, c.getTotal_price());
		pst.setString(6, c.getPayment_status());
		pst.executeUpdate();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}	
	}
	public static List<cart> getcartbyuser(int uid)
	{
		String payment_status= "false";
		List<cart> list = new ArrayList<>();
		try {
			Connection conn=UserUtil.createcConnection();
			String sql ="select * from cart where uid=? and payment_status=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setString(2, payment_status);
			ResultSet rs =pst.executeQuery();
			while(rs.next())
			{
				cart c= new cart();
				c.setCid(rs.getInt("cid"));
				c.setPid(rs.getInt("pid"));
				c.setUid(rs.getInt("uid"));
				c.setProduct_price(rs.getInt("product_price"));
				c.setProduct_qty(rs.getInt("product_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setPayment_status(rs.getString("payment_status"));
				
				list.add(c);
			}
			
		} catch (Exception e) {
         e.printStackTrace();
		}
		return list;
	}
	public static boolean checkcart(cart c)
	{
		boolean cartflag= false;
		try {
			Connection conn =UserUtil.createcConnection();
			String sql="select * from cart where uid=? and pid=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, c.getUid());
			pst.setInt(2, c.getPid());
			ResultSet rs =pst.executeQuery();
			if(rs.next())
			{
				cartflag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
         
		}
		return cartflag;
		
	}
	public static void removefromcart(cart c)
	{
		try {
			Connection conn =UserUtil.createcConnection();
			String sql="delete from cart where pid=? and uid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, c.getPid());
			pst.setInt(2, c.getUid());
			pst.executeUpdate();
		} catch (Exception e) {
         e.printStackTrace();
		}
	}
	public static cart getcart(int cid)
	{
		cart c=null;
		try {
			Connection conn=UserUtil.createcConnection();
			String sql ="select * from cart where cid=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, cid);
			ResultSet rs =pst.executeQuery();
			if(rs.next())
			{
				 c= new cart();
				c.setCid(rs.getInt("cid"));
				c.setPid(rs.getInt("pid"));
				c.setUid(rs.getInt("uid"));
				c.setProduct_price(rs.getInt("product_price"));
				c.setProduct_qty(rs.getInt("product_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setPayment_status(rs.getString("payment_status"));
				
				
			}
			
		} catch (Exception e) {
         e.printStackTrace();
		}
		return c;
	}
	public static void updatecart(cart c)
	{
		try {
			Connection conn =UserUtil.createcConnection();
			String sql="update cart set total_price=?,product_qty=? where cid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, c.getTotal_price());
			pst.setInt(2, c.getProduct_qty());
			pst.setInt(3, c.getCid());
			pst.executeUpdate();
		} catch (Exception e) {
         e.printStackTrace();
		}
	}
	public static void updateCartStatus(int cid)
	{
		String status="true";
		try {
			Connection conn=UserUtil.createcConnection();
			String sql="update cart set payment_status=? where cid=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setString(1, status);
			pst.setInt(2, cid);
			pst.executeUpdate();
			
			
		} catch (Exception e) {
        e.printStackTrace();
		}
	}
	public static List<cart> getorderbyuser(int uid)
	{
		String payment_status= "true";
		List<cart> list = new ArrayList<>();
		try {
			Connection conn=UserUtil.createcConnection();
			String sql ="select * from cart where uid=? and payment_status=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setString(2, payment_status);
			ResultSet rs =pst.executeQuery();
			while(rs.next())
			{
				cart c= new cart();
				c.setCid(rs.getInt("cid"));
				c.setPid(rs.getInt("pid"));
				c.setUid(rs.getInt("uid"));
				c.setProduct_price(rs.getInt("product_price"));
				c.setProduct_qty(rs.getInt("product_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setPayment_status(rs.getString("payment_status"));
				
				list.add(c);
			}
			
		} catch (Exception e) {
         e.printStackTrace();
		}
		return list;
	}
}
