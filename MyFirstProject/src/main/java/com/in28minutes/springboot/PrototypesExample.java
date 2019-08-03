package com.in28minutes.springboot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")    
public class PrototypesExample {
	
	PrototypesExample(){
		System.out.println("Object Created");
	}
}
