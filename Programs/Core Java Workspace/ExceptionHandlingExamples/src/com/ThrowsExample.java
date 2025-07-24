package com;

public class ThrowsExample {
	static void dispay1() throws Exception{
		//try {
		int result = 100/0;
		//}catch(Exception e) {}
		System.out.println("display1 method");
	}
	static void display2() throws Exception{
		//try {
		dispay1();
		//}catch(Exception e) {}
		System.out.println("display2 method");
	}
	public static void main(String[] args)throws Exception {
		try {
		display2();
		}catch(Exception e) {}
		System.out.println("main method");

	}

}
