package com.gk.mph.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Check {
	
	@GetMapping("/getCheck")
	public String getCheck() {
		
		return "wekcome to check";
	}

}
