package com;

import reactor.core.publisher.Mono;

public class SimpleMonoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st Example 
//		Mono<String> mono = Mono.just("Welcome to Mono Reactive Programming");
//		mono.subscribe(data->System.out.println(data));
		
		//2nd example 
//		Mono<String> mono = Mono.just("Welcome to Mono Reactive Programming");
//		mono.subscribe(data->{
//			System.out.println("Here going to subscribe the data");
//			System.out.println(data);
//			}
//		);
		
		// 3rd example with subscribe with 3 parameter 
//		Mono<String> mono = Mono.just("Welcome to Mono Reactive Programming");
//		mono.subscribe(data->{
//			System.out.println("Here going to subscribe the data");
//			System.out.println(data);
//			},
//			error-> {
//				System.out.println("This code execute if any error generate");
//				System.out.println(error);
//			},
//			()-> {
//				System.out.println("This code executed after subscribed successfully");
//			}
//			
//		);

		
		// 4th example with subscribe with 3 parameter with error 
//		Mono<String> mono = Mono.just("Welcome to Mono Reactive Programming").
//				then(Mono.error(new Exception("Exception generated")));
//		
//		mono.subscribe(data->{
//			System.out.println("Here going to subscribe the data");
//			System.out.println(data);
//			},
//			error-> {
//				System.out.println("This code execute if any error generate");
//				System.out.println(error);
//			},
//			()-> {
//				System.out.println("This code executed after subscribed successfully");
//			}
//			
//		);
//		
//		System.out.println("Normal Statement");
		
		
		//5th example with optional (empty)
//		Mono<String> mono = Mono.justOrEmpty(null);
//		mono.subscribe(ele->System.out.println(ele));
//		
//		System.out.println("Done!");
	}

}
