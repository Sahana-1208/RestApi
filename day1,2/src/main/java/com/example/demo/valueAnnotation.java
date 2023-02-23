package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class valueAnnotation {

	@Value("${greeting.message}")
	private String welcome;
	@GetMapping("/valAnno")
	public String Welcome(){
		return welcome;
	}
}
