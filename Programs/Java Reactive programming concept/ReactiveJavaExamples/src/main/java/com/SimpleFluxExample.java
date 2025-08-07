package com;

import java.util.Arrays;
import java.util.List;

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
//		Flux<Integer> flux = Flux.just(1,2,3,4,5,6,7,8,9,10).
//				concatWith(Flux.error(new Exception("Error generated"))).
//				concatWithValues(11,12,13,14,15);
//		
//		flux.subscribe(
//				ele->System.out.println(ele),
//				error->System.out.println(error),
//				()->System.out.println("loaded successfully")
//				);
		
		// 4th example creating flux with different method or operator 
		
//		Flux<Integer> flux = Flux.range(1, 100);
//		flux.subscribe(
//				ele->System.out.println(ele),
//				error->System.out.println(error),
//				()->System.out.println("loaded successfully")
//				);

		// 5th Example Flux with Collection 
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Flux<Integer> flux = Flux.fromIterable(list);
		
		flux.subscribe(
				ele->System.out.println(ele),
				error->System.out.println(error),
				()->System.out.println("loaded successfully")
				);
	}

}
