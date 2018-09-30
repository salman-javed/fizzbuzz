package com.equalexperts.fb;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.equalexperts.fb.enums.EnumDelimiter;

public class FizzBuzzReport implements IFizzBuzzReport {


	private IFizzBuzz fizzBuzz;
	
	public FizzBuzzReport(IFizzBuzz fizzBuzz) {
		super();
		this.fizzBuzz = fizzBuzz;
	}
	
	
	@Override
	public String buildReport(int startRange, int endRange) {
		return IntStream.rangeClosed(startRange, endRange).mapToObj(num -> this.getFizzBuzz().tranformNumberToFizzBuzz(num))
				.collect(Collectors.joining(EnumDelimiter.EMPTYSPACE.getDelimiter()));
	}

	@Override
	public void printReport(int startRange, int endRange) {
		System.out.println(buildReport(startRange, endRange));
	}

	public IFizzBuzz getFizzBuzz() {
		return fizzBuzz;
	}

	public void setFizzBuzz(IFizzBuzz fizzBuzz) {
		this.fizzBuzz = fizzBuzz;
	}

}
