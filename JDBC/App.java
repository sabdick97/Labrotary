package com.jdbc;
import java.sql.Connection;
public class App{
	
	public static void main(String args[])
	{
		Connection conn=DatabaseConnection.getConnection();
		System.out.println(conn);
	}
	
	
}
