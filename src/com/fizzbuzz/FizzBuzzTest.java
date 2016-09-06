package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test3() {
		assertTrue(FizzBuzz.getNumber(3).equals("Fizz"));
	}
	
	@Test
	public void test5() {
		assertTrue(FizzBuzz.getNumber(5).equals("Buzz"));
	}
	
	@Test
	public void test6() {
		assertTrue(FizzBuzz.getNumber(6).equals("Fizz"));
	}
	
	@Test
	public void test10() {
		assertTrue(FizzBuzz.getNumber(10).equals("Buzz"));
	}
	
	@Test
	public void test15() {
		assertTrue(FizzBuzz.getNumber(15).equals("FizzBuzz"));
	}

}
