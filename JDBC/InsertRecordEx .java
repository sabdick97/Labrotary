package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordEx {
	
	public static void main (String args[]) {
		
		try(Connection conn= DatabaseConnection.getConnection())
		{
			//create statement 
			Statement st= conn.createStatement();
			
			String sql = "insert into teacher values(102,'Pritam','pritam@outlook.com',30000),"
					+"(103,'Sabdick','sabdick97@gmail.com',10000)";
			int row= st.executeUpdate(sql);
			System.out.println(row+ "record inserted sucessfully!!");
			
			
		}
		
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
