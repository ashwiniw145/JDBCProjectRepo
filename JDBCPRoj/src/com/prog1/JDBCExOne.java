package com.prog1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExOne {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Statement statement = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		statement = connection.createStatement();
	
		System.out.println("--------------------");
		ResultSet set = statement.executeQuery("select * from emp1");
		while(set.next()) {
			System.out.println(set.getInt("id")+"    "+set.getString("fname")+" "+set.getString("lname")+"            "+set.getFloat("salary"));
		}
	}

}
