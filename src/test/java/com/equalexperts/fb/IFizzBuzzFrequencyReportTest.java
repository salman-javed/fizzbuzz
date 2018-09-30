package com.equalexperts.fb;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.equalexperts.fb.enums.EnumFizzBuzz;



public class IFizzBuzzFrequencyReportTest {

	private IFizzBuzzFrequencyReport fizzBuzzReport;
	
	
	@Before
	public void setUp() throws Exception {
		fizzBuzzReport = new FizzBuzzFrequencyReport(new FizzBuzzLucky());
	}

	@Test
	public void testCalculateDistinctElementsFrequency() {
		
		Map<String, Integer> expectedDistinctElementMap = new HashMap<>();
		expectedDistinctElementMap.put(EnumFizzBuzz.INTEGER.getLiteral(), 10);
		expectedDistinctElementMap.put(EnumFizzBuzz.FIZZ.getLiteral(), 4);
		expectedDistinctElementMap.put(EnumFizzBuzz.BUZZ.getLiteral(), 3);
		expectedDistinctElementMap.put(EnumFizzBuzz.FIZZBUZZ.getLiteral(), 1);
		expectedDistinctElementMap.put(EnumFizzBuzz.LUCKY.getLiteral(), 2);
		
		
		//Given
		String outcome = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";
		
		//When
		Map<String, Integer> actualDistinctElementMap = fizzBuzzReport.calculateDistinctElementsFrequency(outcome);
		
		//Then
		assertTrue(actualDistinctElementMap.get(EnumFizzBuzz.INTEGER.getLiteral()).compareTo(expectedDistinctElementMap.get(EnumFizzBuzz.INTEGER.getLiteral())) == 0);
		assertTrue(actualDistinctElementMap.get(EnumFizzBuzz.FIZZ.getLiteral()).compareTo(expectedDistinctElementMap.get(EnumFizzBuzz.FIZZ.getLiteral())) == 0);
		assertTrue(actualDistinctElementMap.get(EnumFizzBuzz.BUZZ.getLiteral()).compareTo(expectedDistinctElementMap.get(EnumFizzBuzz.BUZZ.getLiteral())) == 0);
		assertTrue(actualDistinctElementMap.get(EnumFizzBuzz.FIZZBUZZ.getLiteral()).compareTo(expectedDistinctElementMap.get(EnumFizzBuzz.FIZZBUZZ.getLiteral())) == 0);
		assertTrue(actualDistinctElementMap.get(EnumFizzBuzz.LUCKY.getLiteral()).compareTo(expectedDistinctElementMap.get(EnumFizzBuzz.LUCKY.getLiteral())) == 0);
	}

	@Test
	public void testBuildReport() {
		
		String expectedOutcome = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10";
		
		//Given
		int startRange = 1;
		int endRange = 20;
		
		//When
		String outcome = fizzBuzzReport.buildReport(startRange, endRange);
		
		//Then
		assertTrue(outcome.length()==expectedOutcome.length());
		assertTrue(outcome.contentEquals(expectedOutcome));
	}

}
