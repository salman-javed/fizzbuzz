package com.equalexperts.fb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.equalexperts.fb.enums.EnumFizzBuzz;

public class IFizzBuzzTest {

private IFizzBuzz fizzBuzz;
	
	@Before
	public void setUp() throws Exception {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testIsFizz() {
		assertTrue(fizzBuzz.isFizz(3));
		assertFalse(fizzBuzz.isFizz(15));
	}

	@Test
	public void testIsBuzz() {
		assertTrue(fizzBuzz.isBuzz(5));
		assertFalse(fizzBuzz.isBuzz(15));
	}
	
	@Test
	public void testIsFizzBuzz() {
		assertTrue(!fizzBuzz.isFizz(15) && !fizzBuzz.isBuzz(15));
	}

	@Test
	public void testTranformNumberToFizzBuzz() {
		String literal = fizzBuzz.tranformNumberToFizzBuzz(15);
		assertTrue(literal.contentEquals(EnumFizzBuzz.FIZZBUZZ.getLiteral()));
	}

}
