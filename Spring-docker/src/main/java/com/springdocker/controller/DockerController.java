package com.springdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@RequestMapping("/greetings") 
	public String greetings() {
		return "Hello World Docker";
	}
	
}
