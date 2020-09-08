package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping(value="welcome", method=RequestMethod.GET)
	public String Welcome() {
		return "Welcome to app";
	}

}
