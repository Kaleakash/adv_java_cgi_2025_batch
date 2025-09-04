package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RequestMapping("reactive")
@RestController
public class SimpleReactiveController {

	@GetMapping(value = "hello")
	public Mono<String> sayHello() {
		Mono<String> mm = Mono.just("Welcome Simple Reactive App using spring boot");
		return mm;
	}
}
