package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class CalculatorTest {

	private Calculator calculator;
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	@Test
	public void addTest() {
		assertEquals(4,calculator.add(2, 2));
		
	}
	public void subtractTest(){
		assertEquals(0,calculator.subtract(1,1));
	}
	
	public void multiplyTest(){
		assertEquals(10,calculator.multiply(2,5));
	}
	
	public void divideTest(){
		assertEquals(2,calculator.divide(10,5));
	}
	public void equalsTestTrue(){
		assertTrue(calculator.isEqual(2,2));}
	
	public void equalsTestFalse(){
		assertFalse(calculator.isEqual(11,5));
	}

}
