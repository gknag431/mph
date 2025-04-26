package com.gk.mph.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/getSample")
	public String sample() {
		
		return "Welcome to new project";
	}

}
