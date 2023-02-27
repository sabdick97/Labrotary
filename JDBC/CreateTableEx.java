package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEx {

	public static void main(String[] args) {
	//try with resource
		try(Connection conn=DatabaseConnection.getConnection()){
			
		//create statement
			Statement st=conn.createStatement();
             
			//write / create query
			String sql="create table teacher(id int primary key, name varchar(30)not null,"
					+"email varchar(50) not null unique,salary int not null)";
				
				st.executeUpdate(sql);
				System.out.println("Table created Succesfull !!");
			
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
