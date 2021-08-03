package com.rakshitmalhotra.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@RequestMapping("/hello") // By default GET Mapping
	public String sayHi()
	{
		return "Hi";
	}
}
