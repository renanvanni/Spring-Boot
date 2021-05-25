package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotação que indica que é uma classe controladora
public class HelloController {
	
	@GetMapping("/Hello")
	public String sayHello() {
		return "Hello World";
	}

}
