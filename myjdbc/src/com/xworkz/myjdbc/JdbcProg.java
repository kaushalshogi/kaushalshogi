package com.xworkz.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcProg {

	public static void main(String[] args)  {
		String url="jdbc:mysql://localhost:3306/employeedetails";
		String userName="root";
		String password="Shogi@461676";
		String sqlInsert="insert into ";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,userName,password);
			System.out.println("connection succesfull"+url);
		} catch (SQLException sqlexe)
		{
			sqlexe.printStackTrace();
		}
		catch (ClassNotFoundException classnotfoundexe)
		{
			System.out.println(classnotfoundexe.getMessage());
		}





	}


}
