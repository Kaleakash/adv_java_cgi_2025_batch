package com;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;

import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;

public class AutoConnectOperatorExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CountDownLatch cdl = new CountDownLatch(2);	
		Flux<String> coldFlux = Flux.just("We will start the training").delayElements(Duration.ofSeconds(2));
		
		// to convert normal flux or coldflux to hot flux 
		
		Flux<String> hotFlux = coldFlux.publish().autoConnect(3);	//min subscriber must be 3
		System.out.println("Student 1 join  ");
		hotFlux.subscribe(ele-> {
			System.out.println("Student 1 "+ele);
		});
			
		
		Thread.sleep(5000);
		System.out.println("Student 2 join after 5 sec late ");
		hotFlux.subscribe(ele-> {
			System.out.println("Student 2"+ele);
		});
		System.out.println("waiting");
		Thread.sleep(6000);
		System.out.println("Student 3 join after 6 sec late ");
		hotFlux.subscribe(ele-> {
			System.out.println("Student 3 "+ele);
		});		

		cdl.await();
	}

}
