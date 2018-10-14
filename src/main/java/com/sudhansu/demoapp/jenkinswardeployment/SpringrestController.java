package com.sudhansu.demoapp.jenkinswardeployment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringrestController {
	@GetMapping("/greeting")
	public String hello() {

		return "Hello";
	}
}
