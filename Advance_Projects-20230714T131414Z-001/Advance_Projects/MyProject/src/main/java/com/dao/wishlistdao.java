package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Util.UserUtil;
import com.bean.cart;
import com.bean.wishlist;

public class wishlistdao {
	
	public static void addtowishlist(wishlist w)
	{
	try {
		Connection conn = UserUtil.createcConnection();
		String sql ="insert into wishlist(pid,uid) values (?,?)";
		PreparedStatement pst =conn.prepareStatement(sql);
		pst.setInt(1, w.getPid());
		pst.setInt(2, w.getUid());
		pst.executeUpdate();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}	
	}
	public static List<wishlist> getwishlistbyuser(int uid)
	{
		List<wishlist> list = new ArrayList<>();
		try {
			Connection conn=UserUtil.createcConnection();
			String sql ="select * from wishlist where uid=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs =pst.executeQuery();
			while(rs.next())
			{
				wishlist w = new wishlist();
				w.setWid(rs.getInt("wid"));
				w.setPid(rs.getInt("pid"));
				w.setUid(rs.getInt("uid"));
				list.add(w);
			}
			
		} catch (Exception e) {
         e.printStackTrace();
		}
		return list;
	}
	public static boolean checkwishlist(wishlist w)
	{
		boolean wishlistflag= false;
		try {
			Connection conn =UserUtil.createcConnection();
			String sql="select * from wishlist where uid=? and pid=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, w.getUid());
			pst.setInt(2, w.getPid());
			ResultSet rs =pst.executeQuery();
			if(rs.next())
			{
				wishlistflag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
         
		}
		return wishlistflag;
		
	}
	public static void removefromwishlist(wishlist w)
	{
		try {
			Connection conn =UserUtil.createcConnection();
			String sql="delete from wishlist where pid=? and uid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, w.getPid());
			pst.setInt(2, w.getUid());
			pst.executeUpdate();
		} catch (Exception e) {
         e.printStackTrace();
		}
	}
	

}
