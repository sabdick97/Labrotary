package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		try(Connection conn=DatabaseConnection.getConnection();
				Scanner sc= new Scanner(System.in))
		{
			String sql="delete from teacher where id=?";
					PreparedStatement ps=conn.prepareStatement(sql);
			
					System.out.println("Enter Id: ");
					int id=sc.nextInt();
					sc.nextLine();
					 ps.setInt(1, id);
					 int row= ps.executeUpdate();
					 System.out.println(row+ " record deleted successfully !!");
					 if(row>0)
					 {
						 System.out.println("Delete record");
					 }
					 else
					 {
						 System.out.println("Delete not happened!!");
					 }
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
			
		}

	

}
