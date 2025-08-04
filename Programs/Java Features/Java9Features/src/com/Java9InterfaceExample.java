package com;
interface Operation {
	void dis1();
	default void dis2() {
		
	}
	static void dis3() {
		dis4();
	}
	private static void dis4() {
		System.out.println("private dis4 method");
	}
}

public class Java9InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation.dis3();
		//var a=10;
	}

}
