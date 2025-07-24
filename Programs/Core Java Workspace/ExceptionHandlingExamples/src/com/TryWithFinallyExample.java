package com;

public class TryWithFinallyExample {

	static void display() {
		System.out.println("display method");
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			int result = 100/0;
			System.out.println("No Exception "+result);
		}finally {
			System.out.println("finally block");
			display();
		}
		System.out.println("Normal statement");

	}

}
