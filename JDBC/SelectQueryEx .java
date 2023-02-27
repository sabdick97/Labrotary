package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQueryEx {
 public static void main(String args[]) {
	 try(Connection conn=DatabaseConnection.getConnection())
	 {
		 String sql="select * from teacher";
		 
		 PreparedStatement pst= conn.prepareStatement(sql);
		 ResultSet resultset= pst.executeQuery();
		 
		 while(resultset.next())// result set next method
		 {
			System.out.println("Teacher ID: "+resultset.getInt(1)); // get int number one column
			 System.out.println("Teacher Name: "+resultset.getNString(2));// get 
			 System.out.println("Teacher Email: "+resultset.getString(3));
			 System.out.println("Teacher Salary :"+resultset.getInt(4));
		 }
		 
		 
	 }
	 
	 catch(SQLException e)
	 {
		 System.out.println(e.getMessage());
	 }
	 
 }
}

