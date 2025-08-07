package com;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;

import reactor.core.publisher.Flux;

public class ColdPublisher {

	public static void main(String[] args) throws Exception{
	CountDownLatch cdl = new CountDownLatch(2);	
		Flux<Integer> coldFlux = Flux.range(1, 10).delayElements(Duration.ofSeconds(2));
		
		// subscriber 1 join 
		System.out.println("Subscribe 1 join");
		coldFlux.subscribe(ele-> {
			System.out.println("Subscribe 1="+ele);
		});

		// subscriber 2 join 
		System.out.println("Subscribe 2 join");
		coldFlux.subscribe(ele-> {
			System.out.println("Subscribe 2="+ele);
		});
		Thread.sleep(5000);
		
		// subscriber 2 join 
		System.out.println("Subscribe 3 join");
		coldFlux.subscribe(ele-> {
			System.out.println("Subscribe 3="+ele);
		});
				
		System.out.println("Main thread is waiting");
		cdl.await();
	}

}
