package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Emputil {
	
	public static Connection  createConnection() {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_8","root","");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return connection;
	}

}
