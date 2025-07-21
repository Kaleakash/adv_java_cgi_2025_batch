package com;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("main method");
//		Car innova = new Car();	// heap memory 
//		innova.start();
//		
//		innova.stop();
//		
//		Car ertiga = new Car();
//		ertiga.start();
//		ertiga.stop();
		
		Car innova = new Car();	
		//innova.displayDetails();
		innova.wheel=4;
		innova.colour="Gray";
		innova.price=3500000;
		innova.displayDetails("innova");
	System.out.println("-------------");
	Car ertiga = new Car();
	//ertiga.displayDetails();
	ertiga.wheel=4;
	ertiga.colour="White";
	ertiga.price=1500000;
	ertiga.displayDetails("Ertiga");
	
	}

}
