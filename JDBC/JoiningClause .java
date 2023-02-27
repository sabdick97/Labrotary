package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JoiningClause {

	public static void main(String[] args) {
		try(Connection conn=DatabaseConnection.getConnection())
		{
//			Statement st= conn.createStatement();
//			String create= "create table course1(c_id int primary key auto_increment,"
//					+ "course_name varchar(20), teacher_id int,"
//					+"foreign key(teacher_id) references teacher(id))";
//			int row= st.executeUpdate(create);
//			System.out.println(row+"table created successfully!!");
//			
//			Statement st1= conn.createStatement();
//			String q="insert into course1(course_name,teacher_id) values ('JAVA',123),"
//					+"('MySQL',126)";
//			int row1= st1.executeUpdate(q);
//			System.out.println(row1+ "records insert sucessfull!!");
//			
			Statement st2= conn.createStatement();
			//EQUI Join
			//String sql= "select t.id, t.name, c.course_name from teacher t,course1 c"
					//+"where t.id=c.teacher_id;
			//INNER JOIN
		//	String sql2= "select t.id,t.name,c.course_name from teacher t inner join course1 c "
			//		+ "on t.id=c.teacher_id";
			
			//LEFT Join
			String sql3="select t.id,t.name,c.course_name from teacher t,course1 c "
					+"on t.id=c.teacher.id";
			ResultSet resultset=st2.executeQuery(sql3);
			
			while(resultset.next())
			{
				System.out.println("Teacher ID :" +resultset.getInt(1));
				System.out.println("Teacher Name: "+resultset.getString("name"));
				System.out.println("Course Name :"+resultset.getString("course_name"));
			}
		}
catch(SQLException e)
		{
	System.out.println(e.getMessage());
		}
	}

}
