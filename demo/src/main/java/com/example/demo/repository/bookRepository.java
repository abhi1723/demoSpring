package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.person.book;
import com.example.demo.person.person;

public interface bookRepository extends CrudRepository<book, Integer>  {

}
