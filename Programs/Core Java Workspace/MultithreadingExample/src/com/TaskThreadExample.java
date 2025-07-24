package com;

class Task1 implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("thread running "+t);
	}
}
public class TaskThreadExample {

	public static void main(String[] args) {
	Runnable task1 = new Task1();
	ThreadGroup tg = new ThreadGroup("task1 group");
//	Thread t1 = new Thread(tg,task1);
//	Thread t2 = new Thread(tg,task1);
//	Thread t3 = new Thread(task1);
//	Thread t4 = new Thread(task1);
	
	Thread t1 = new Thread(tg,task1,"first");
	Thread t2 = new Thread(tg,task1,"second");
	Thread t3 = new Thread(task1,"third");
	Thread t4 = new Thread(task1,"fourth");
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}

}
