package com.example.prueba.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	@RequestMapping("/api/hi")
	public String hi() {
		return "Hola, Spring Boot";
	}
	
}
