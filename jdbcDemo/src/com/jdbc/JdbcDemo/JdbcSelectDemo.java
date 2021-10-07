package com.jdbc.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectDemo {

	public static void main(String[] args) throws SQLException {

		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String password="Shogi@461676";
		String sQuery="select * from employe_details;";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//optional beacuse we are using type4 driver
			connection =DriverManager.getConnection(url,userName,password);
			System.out.println("Connection Successful : " +url);
			Statement statment=connection.createStatement();
			ResultSet resultset=statment.executeQuery(sQuery);//fatching the select query and assignig in resultset type

			resultset.next();//it will move to other row
			System.out.println("id :" +resultset.getInt(1));
			System.out.println("firstName :" +resultset.getString(2));
			System.out.println("lastName :" +resultset.getString(3));
			System.out.println("Salary :" +resultset.getDouble(4));
			System.out.println("Dob :" +resultset.getString(5));
			System.out.println("City :" +resultset.getString(6));

			resultset.next();
			System.out.println("id :" +resultset.getInt(1));
			System.out.println("firstName :" +resultset.getString(2));
			System.out.println("lastName :" +resultset.getString(3));
			System.out.println("Salary :" +resultset.getDouble(4));
			System.out.println("Dob :" +resultset.getString(5));
			System.out.println("City :" +resultset.getString(6));

		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		finally {
			if(connection != null) {
				connection.close();//closing the connection

			}
		}

	}
}
