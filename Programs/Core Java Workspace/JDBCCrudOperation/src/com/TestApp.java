package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db1", 
			"root", "root@123");
	System.out.println("connected");
	Statement stmt = con.createStatement();
	System.out.println("Statement object created..");
	
	ResultSet rs= stmt.executeQuery("select * from employee");
		while(rs.next()) {
		System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
		}
		
		rs.close();
		stmt.close();
		con.close();
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
