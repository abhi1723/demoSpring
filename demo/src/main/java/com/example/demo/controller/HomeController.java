package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.person.person;
import com.example.demo.person.user;

@RestController
public class HomeController {

	@GetMapping("/hello")
	public String HelloWorld() {
		return "Hello World";
	}
	@GetMapping("/helloName/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello"+name;
	}
	@PostMapping("/square")
	public String getSquare(@RequestParam String number) {
		int n=Integer.parseInt(number);
		return "Square:"+(n*n);
	}
	@PostMapping("/details")
	public String getDetails(@RequestBody person p) {
		return p.toString();
	}
	@PostMapping("/authenticate")
	public String getUser(@RequestBody user u) {
		return u.toString();
	}
}
