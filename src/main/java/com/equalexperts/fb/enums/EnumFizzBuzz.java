package com.equalexperts.fb.enums;

public enum EnumFizzBuzz {
	FIZZ("fizz"),
	BUZZ("buzz"),
	FIZZBUZZ("fizzbuzz"),
	LUCKY("lucky"),
	INTEGER("integer");
	
	private String literal;
	
	EnumFizzBuzz(String literal) {
		this.literal = literal;
	}

	public String getLiteral() {
		return literal;
	}
	
	
}
