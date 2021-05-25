package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello Word" + "\nAs habilidades e mentalidades utilizadas foram:" + "\nOrientação ao futuro" 
							+ "\nResponsabilidade pessoal" + "\nMentalidade de crescimento" + "\nPersistência" 
							+ "\nAtenção aos detalhes" + "\nProatividade";
	}
}
