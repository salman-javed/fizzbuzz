package com.equalexperts.fb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;

import com.equalexperts.fb.enums.EnumDelimiter;
import com.equalexperts.fb.enums.EnumFizzBuzz;


public class FizzBuzzFrequencyReport implements IFizzBuzzFrequencyReport {

private IFizzBuzz fizzBuzz;
	
	public FizzBuzzFrequencyReport(IFizzBuzz fizzBuzz) {
		super();
		this.fizzBuzz = fizzBuzz;
	}

	@Override
	public String buildReport(int startRange, int endRange) {
		
		String simpleOutput = IntStream.rangeClosed(startRange, endRange).mapToObj(num -> this.getFizzBuzz().tranformNumberToFizzBuzz(num))
				.collect(Collectors.joining(EnumDelimiter.EMPTYSPACE.getDelimiter()));
		
		Map<String, Integer> distinctElementMap = this.calculateDistinctElementsFrequency(simpleOutput);

		return String.format(
				"%s " + EnumFizzBuzz.FIZZ.getLiteral() + ": %s " + EnumFizzBuzz.BUZZ.getLiteral() + ": %s "
						+ EnumFizzBuzz.FIZZBUZZ.getLiteral() + ": %s " + EnumFizzBuzz.LUCKY.getLiteral() + ": %s " +EnumFizzBuzz.INTEGER.getLiteral()+": %s",
						simpleOutput, distinctElementMap.get(EnumFizzBuzz.FIZZ.getLiteral()),
				distinctElementMap.get(EnumFizzBuzz.BUZZ.getLiteral()),
				distinctElementMap.get(EnumFizzBuzz.FIZZBUZZ.getLiteral()), distinctElementMap.get(EnumFizzBuzz.LUCKY.getLiteral()), distinctElementMap.get(EnumFizzBuzz.INTEGER.getLiteral())); 
	}
	
	
	@Override
	public Map<String, Integer> calculateDistinctElementsFrequency(String output) {

		Map<String, Integer> distinctElementMap = new HashMap<>();
		List<String> distinctElements = Arrays.asList(output.split(EnumDelimiter.EMPTYSPACE.getDelimiter())).stream().collect(Collectors.toList());
		for (String element : distinctElements) {
			String key = generateUniqueKeyForNumeric(element);
			distinctElementMap.put(key, distinctElementMap.get(key) != null ? distinctElementMap.get(key) + 1 : 1);
		}
		return distinctElementMap;
	}

	@Override
	public void printReport(int startRange, int endRange) {
		System.out.println(this.buildReport(startRange, endRange));
		
	}
	
	public IFizzBuzz getFizzBuzz() {
		return fizzBuzz;
	}

	public void setFizzBuzz(IFizzBuzz fizzBuzz) {
		this.fizzBuzz = fizzBuzz;
	}
	/**
	 * 
	 * @param input
	 * @return String
	 */
	private static String generateUniqueKeyForNumeric(String input) {
		return StringUtils.isNumeric(input) ? EnumFizzBuzz.INTEGER.getLiteral() : input;
	}

}
