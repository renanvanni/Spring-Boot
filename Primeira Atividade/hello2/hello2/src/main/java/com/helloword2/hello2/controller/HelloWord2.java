package com.helloword2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class HelloWord2 {

	@GetMapping
	public String hello2() {
		return "Hello World" + "\nPara essa semana tenho o objetivo de aprender e desenvolver:" + "\nTrabalho em equipe"
							 + "\nLiderança" + "\nGestão do tempo" + "\nComunicação" + "\nProatividade";
	}
}
