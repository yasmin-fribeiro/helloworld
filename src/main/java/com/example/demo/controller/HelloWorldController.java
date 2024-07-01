package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

	@GetMapping ("hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping ("persistencia")
	public String bsm () {
		return "Persistência";
	}
	
	@GetMapping ("objetivos")
	public String objetivosDaSemana() {
		return "Revisar conteúdo, revisar e enviar currículo, reunir com o grupo de PI";
	}
}
