package com;

public class Car {
int wheel;
float price;
String colour;			// instance varable 

	Car() {
	System.out.println("object created...");
	wheel=4;
	price = 1000000;
	colour="Unkonwn";
	}
	Car(int wheel1, float price1, String colour1){
		wheel= wheel1;
		price=price1;
		colour=colour1;
	}
	void start() {
		System.out.println("car start");
	}
	void appliedGear() {
		System.out.println("Applied Gear");
	}
	void moving() {
		System.out.println("Car is moving");
	}
	void stop() {
		System.out.println("Car stop");
	}
	void displayDetails(String name) {
		String msg="Car Details :"+name;
		System.out.println(msg);
		System.out.println("wheel is "+wheel);
		System.out.println("price is "+price);
		System.out.println("Colour is "+colour);
	}
}
