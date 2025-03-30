package com.springboot.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Messgae")
public class TestController {

	@GetMapping("/msg")
	public String getMessage() {
		
		return "This is sample demo for Jenkins CICD Docker Image APplication";
	}
	
}
