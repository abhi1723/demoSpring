package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.controller.BookController;
import com.example.demo.repository.StubBookRepository;
import com.example.demo.test.Arithmetic;

public class ArithmeticTest {

	Arithmetic testArithmetic = new Arithmetic();
	
	BookController b;
	@Before
	public void setup() {
		b=new BookController(new StubBookRepository()) ;
	}
	
	@Test
	public void testData() {
		assertTrue(b.findBook(1).getName().equalsIgnoreCase("Abhishek"));
	}
	
	@Test
	public void testCase() {
		assertEquals(true,testArithmetic.checkLeapYear(2000));
		assertEquals(false,testArithmetic.checkLeapYear(1000));
		assertEquals(true,testArithmetic.checkLeapYear(2016));
		assertEquals(false,testArithmetic.checkLeapYear(2005));
		
	}
}
