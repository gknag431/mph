package com.gk.mph.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/getSamplesData")
	public String getSample() {
		
		return "welcome to sample data from controller";
	}

}
