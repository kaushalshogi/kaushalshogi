package com.jdbc.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class JdbcDemoMain {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";
		String sqlInsert="insert employees.employe_details value(5,'Shamita','Shetty',20000,'1992-03-09','Mumbai');";
		String sqlUpdate="update employe_details set city='Bangalore' where id=1;";
		String sqlDelete="delete from employe_details where id=4;";



		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,userName,password);
			System.out.println("connection succesfull : " +url);

			Statement stmt=connection.createStatement();
			stmt.executeUpdate(sqlInsert);
			System.out.println("data is inserted");
			
			/*stmt.executeUpdate(sqlUpdate);
			System.out.println("data is updated");
			
			stmt.executeUpdate(sqlDelete);
			System.out.println("data is deleted");*/
		} 
		catch (SQLException sqlexe)
		{
			sqlexe.printStackTrace();
		}
		catch(ClassNotFoundException s) {
			s.printStackTrace();			
		}




	}


}




