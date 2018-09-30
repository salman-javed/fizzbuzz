package com.equalexperts.fb.enums;

public enum EnumDelimiter {
	EMPTYSPACE(" ");
	
	private String delimiter;
	
	EnumDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	public String getDelimiter() {
		return delimiter;
	}
	
	
}
