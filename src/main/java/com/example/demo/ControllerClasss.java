package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClasss {

	@GetMapping("/Hello/{name}")
	public String greet(@PathVariable("name")String name) {
		return "Hello"+ name;
	}
	@GetMapping("/welcome")
	public String wel() {
		return "welcome to jenkins course";
	}
	
}
