package com.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserUtil {
	
	public static Connection createcConnection() {
		Connection conn= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/java_8","root","");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
