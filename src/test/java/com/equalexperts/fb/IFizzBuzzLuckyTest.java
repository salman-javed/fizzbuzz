package com.equalexperts.fb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.equalexperts.fb.enums.EnumFizzBuzz;

public class IFizzBuzzLuckyTest {
	
private IFizzBuzzLucky fizzBuzz;
	
	@Before
	public void setUp() throws Exception {
		fizzBuzz = new FizzBuzzLucky();
	}
	
	@Test
	public void testIsLucky() {
		assertTrue(fizzBuzz.isLucky(13));
	}

	@Test
	public void testTranformNumberToFizzBuzz() {
		String literal = fizzBuzz.tranformNumberToFizzBuzz(13);
		assertTrue(literal.contentEquals(EnumFizzBuzz.LUCKY.getLiteral()));
	}

}
