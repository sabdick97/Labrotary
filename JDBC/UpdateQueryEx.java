package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class UpdateQueryEx {

	public static void main(String[] args) {
		try(Connection con= DatabaseConnection.getConnection();
				Scanner sc= new Scanner(System.in))
				{
					
					System.out.println("Enter name to update :");
					String name= sc.nextLine();
					
					System.out.println("Enter email to update");
					String email=sc.nextLine();
					
					System.out.println("Enter salary to update ");
					int sal= sc.nextInt();
					
					String query="update teacher set name='"+name+"',email='"+email+"',"
							+ "salary='"+sal+"'where id =?)";
					PreparedStatement ps= con.prepareStatement(query);
					
					System.out.println("Enter ID: ");
					int id=sc.nextInt();
					
					ps.setInt(1, id);
					int row=ps.executeUpdate();
					System.out.println(row+ " record updated sucessfull!!");
					System.out.println();
					String query1= "select * from teacher where id='"+id+"'";
					PreparedStatement ps1= con.prepareStatement(query1);
					
					ResultSet resultset= ps1.executeQuery();
					if (resultset.next())
					{
						System.out.println("Teacher ID: "+resultset.getInt(1)); 
						 System.out.println("Teacher Name: "+resultset.getString(2));
						 System.out.println("Teacher Email: "+resultset.getString(3));
						 System.out.println("Teacher Salary :"+resultset.getInt(4));
						 System.out.println("=====================================");
			    		 
						
						
					}
					else 
						System.out.println("ID not found!!");
					
				}
				catch(SQLException e)
		{
					System.out.println(e.getMessage());
		}

	}
}

