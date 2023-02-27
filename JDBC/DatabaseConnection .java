package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
	
	static Connection conn=null;
	
	//this method will create a connection and return the connection object
	
	public static Connection getConnection()
	{
		try {
			
			//register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish a connection 
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","root");
			
			
		}
			
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
		return conn;
	}

}
