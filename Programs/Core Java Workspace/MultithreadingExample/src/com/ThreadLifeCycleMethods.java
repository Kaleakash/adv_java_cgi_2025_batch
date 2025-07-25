package com;

class Game implements Runnable{
	@Override
	public void run() {
		String bike = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			try {
				System.out.println(bike+" moving with speed "+i);
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class CarGame implements Runnable{
	@Override
	public void run() {
		String car = Thread.currentThread().getName();
		for(int i=0;i<20;i++) {
			try {
				System.out.println(car+" moving with speed "+i);
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class ThreadLifeCycleMethods {

	public static void main(String[] args) throws Exception{
	Game gg = new Game();
	CarGame cg = new CarGame();
	Thread bike1 = new Thread(gg,"bike1");
	Thread bike2 = new Thread(gg,"bike2");
	Thread bike3 = new Thread(gg,"bike3");
	Thread car1 = new Thread(cg,"car 1");
	Thread car2 = new Thread(cg,"car 2");
	System.out.println("bike1 status "+bike1.isAlive());
	System.out.println("bike2 status "+bike2.isAlive());
	System.out.println("bike3 status "+bike3.isAlive());
	System.out.println("Game Start");
	Thread.sleep(1000);
	System.out.println("1.....");
	Thread.sleep(1000);
	System.out.println("2.....");
	Thread.sleep(1000);
	System.out.println("3.....");
	bike1.start();
	bike2.start();
	bike3.start();
	car1.start();
	car2.start();
	System.out.println("bike1 status "+bike1.isAlive());
	System.out.println("bike2 status "+bike2.isAlive());
	System.out.println("bike3 status "+bike3.isAlive());
	bike1.join();  // bike1 thread join to parent thread. after line code will execute after child thread get destroy
	bike2.join(); 
	bike3.join(); 
	car1.join(); 
	car2.join(); 
	System.out.println("Game End....");
	}

}
