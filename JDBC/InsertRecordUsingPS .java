package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordUsingPS {

	public static void main(String[] args) {
		//try with resource
		try(Connection con=DatabaseConnection.getConnection();
			Scanner sc= new Scanner(System.in))
		{
			String sql="insert into teacher values(?,?,?,?)";//inserting record using prepared statement
			
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Name");
			String name=sc.nextLine();
			
			System.out.println("Enter email");
			String email=sc.nextLine();
			
			System.out.println("Enter Salary :");
			int salary=sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, salary);
			
		int row=ps.executeUpdate();//execute update for insert query
		System.out.println(row+ " record inserted successfully !!");
		
		System.out.println();
		
	String query="select * from teacher where id='"+id+"'";
	PreparedStatement ps1=con.prepareStatement(query);
	
	ResultSet resultset=ps1.executeQuery();
	if(resultset.next())
	{
		 System.out.println("Teacher ID: "+resultset.getInt(1)); 
		 System.out.println("Teacher Name: "+resultset.getString(2));
		 System.out.println("Teacher Email: "+resultset.getString(3));
		 System.out.println("Teacher Salary :"+resultset.getInt(4));
		 
		 	
	}
	
	else
	{
		System.out.println("ID not found !!");
	}
		
		
		}
			catch(SQLException e)
		{
				System.out.println(e.getMessage());
		}
			
			
		}

	}


