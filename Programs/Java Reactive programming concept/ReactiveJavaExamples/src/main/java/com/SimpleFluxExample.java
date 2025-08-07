package com;

import reactor.core.publisher.Flux;

public class SimpleFluxExample {

	public static void main(String[] args) {
		//1st example 
		
//		Flux<Integer> flux = Flux.just(1,2,3,4,5,6,7,8,9,10);
//		flux.subscribe(ele->System.out.println(ele));

		
		// 2nd example 
		
//		Flux<Integer> flux = Flux.just(1,2,3,4,5,6,7,8,9,10);
//		flux.subscribe(
//				ele->System.out.println(ele),
//				error->System.out.println(error),
//				()->System.out.println("loaded successfully")
//				);
		
		// 3rd Example 
//		Flux<Integer> flux = Flux.just(1,2,3,4,5,6,7,8,9,10).concatWithValues(11,12,13,14,15);
		Flux<Integer> flux = Flux.just(1,2,3,4,5,6,7,8,9,10).
				concatWith(Flux.error(new Exception("Error generated"))).
				concatWithValues(11,12,13,14,15);
		
		flux.subscribe(
				ele->System.out.println(ele),
				error->System.out.println(error),
				()->System.out.println("loaded successfully")
				);

	}

}
