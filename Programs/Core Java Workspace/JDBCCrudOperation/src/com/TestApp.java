package com;

public class TestApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysq.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
