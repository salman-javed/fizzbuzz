package com.equalexperts.fb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class IFizzBuzzReportTest {


	IFizzBuzzReport fizzBuzzReport;
	
	@Before
	public void setUp() throws Exception {
		fizzBuzzReport = new FizzBuzzReport(new FizzBuzz());
	}

	@Test
	public void testBuildReport() {
		
		String expectedOutcome = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz";
		
		//Given
		int startRange = 1;
		int endRange = 20;
		
		//When
		String outcome = fizzBuzzReport.buildReport(startRange, endRange);
		
		//Then
		assertTrue(outcome.length() == expectedOutcome.length());
		assertTrue(outcome.contentEquals(expectedOutcome));
	}

}
