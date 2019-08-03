package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService service;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return service.welcomeService();
	}
}

@Service
class WelcomeService {
	
	public String welcomeService() {
		return "Testing component and autowiring"; 
	
	}
}