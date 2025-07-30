package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db1", 
			"root", "root@123");
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
