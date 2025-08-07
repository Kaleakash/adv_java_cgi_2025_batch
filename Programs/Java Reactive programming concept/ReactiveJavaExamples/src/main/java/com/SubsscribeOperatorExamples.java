package com;

import java.time.Duration;

import reactor.core.publisher.Flux;

public class SubsscribeOperatorExamples {

	public static void main(String[] args) throws Exception{
		// 1st Example 
		// server side 
		//Flux<Integer> flux = Flux.range(1, 100);
		
		// client application 
		//flux.subscribe(ele->System.out.println(ele));
		
		//flux.filter(ele->ele%2==0).subscribe(ele->System.out.println(ele));
		//flux.filter(ele->ele%2!=0).subscribe(ele->System.out.println(ele));
		//flux.map(ele->ele+100).subscribe(ele->System.out.println(ele));
		//flux.skip(10).take(20).subscribe(ele->System.out.println(ele));
		
		// 2nd Example 
		Flux<Integer> flux = Flux.range(1, 10).delayElements(Duration.ofSeconds(5));
		
		flux.subscribe(ele-> {
			System.out.println(ele);
		});
		System.out.println("Hello");
		Thread.sleep(1000000);
	}

}
