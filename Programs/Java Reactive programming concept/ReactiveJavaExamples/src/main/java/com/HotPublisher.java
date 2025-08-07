package com;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;

import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;

public class HotPublisher {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CountDownLatch cdl = new CountDownLatch(2);	
		Flux<Integer> coldFlux = Flux.range(1, 10).delayElements(Duration.ofSeconds(2));
		
		// to convert normal flux or coldflux to hot flux 
		
		ConnectableFlux<Integer> hotFlux = coldFlux.publish();
		System.out.println("Subscriber 1 join before connect ");
		hotFlux.subscribe(ele-> {
			System.out.println("Subscriber 1 "+ele);
		});
		
		// start publishing 
		hotFlux.connect();	
		
		Thread.sleep(5000);
		System.out.println("Subscriber 2 join after connect ");
		hotFlux.subscribe(ele-> {
			System.out.println("Subscriber 2 (late 5 seconds) "+ele);
		});
		
		Thread.sleep(2000);
		System.out.println("Subscriber 3 join after connect ");
		hotFlux.subscribe(ele-> {
			System.out.println("Subscriber 3 (late 7 seconds) "+ele);
		});		
		
		cdl.await();
		
	}

}
