package com.example.demo.test;

public class Arithmetic {

	public int getSum(int a , int b) {
		return (a+b);
	}
	public boolean checkLeapYear(int year) {
		if(year%400==0) return true;
		if(year%100==0) return false;
		if(year%4==0) return true;
		return false;
	}
}
