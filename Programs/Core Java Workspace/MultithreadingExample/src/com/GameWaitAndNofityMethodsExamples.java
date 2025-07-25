package com;

class Bike implements Runnable{
	@Override
	public synchronized void run() {
		String bike = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			try {
				System.out.println(bike+" moving with speed "+i);
				Thread.sleep(500);
				if(bike.equals("Bike 1") && i==4) {
					wait();
				}
				if(bike.equals("Bike 2") && i==8) {
					notify();
					wait();
				}
				if(bike.equals("Bike 3") && i==5) {
					notifyAll();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class Car implements Runnable{
	@Override
	public synchronized void run() {
		String car = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			try {
				System.out.println(car+" moving with speed "+i);
				Thread.sleep(500);
				if(car.equals("Car 1") && i==6) {
					wait();
				}
				if(car.equals("Car 2") && i==4) {
					notify();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class GameWaitAndNofityMethodsExamples {

	public static void main(String[] args) {
	Car car = new Car();
	Bike bb = new Bike();
	Thread bike1 = new Thread(bb, "Bike 1");
	Thread bike2 = new Thread(bb, "Bike 2");
	Thread bike3 = new Thread(bb, "Bike 3");
	
	Thread car1 = new Thread(car, "Car 1");
	Thread car2 = new Thread(car, "Car 2");
	Thread car3 = new Thread(car, "Car 3");
	
	bike1.start();
	bike2.start();
	bike3.start();
	
	car1.start();
	car2.start();
	car3.start();
	
	}

}
