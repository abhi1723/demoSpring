package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.person.book;
import com.example.demo.repository.bookRepository;

@RestController
public class BookController {

	//@Autowired
	bookRepository bRepo;
	
	public BookController(bookRepository b) {
		bRepo=b;
	}
	
	@PostMapping("/saveBook")
	public String saveBooks(@RequestBody book b) {
		
		book s=bRepo.save(b);
		if(b!=null) {
			return "success";
		}
		else return "failure";
	}
	
	@PostMapping("/findBook")
	public book findBook(@RequestParam Integer id) {
		book s=bRepo.findById(id).get();
		
		return s;
	}
	
	@GetMapping("/findBooks")
	public String findBooks() {
		ArrayList<book> s=new ArrayList<book>();
		s=(ArrayList<book>) bRepo.findAll();
		String k="";
		for(book n: s) {
			k=k+n.getName();
		}
		return k;
	}
}
