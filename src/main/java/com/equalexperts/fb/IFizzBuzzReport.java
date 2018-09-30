package com.equalexperts.fb;

public interface IFizzBuzzReport {
	
	/**
	 * 
	 * @param startRange
	 * @param endRange
	 * @return String
	 */
	public String buildReport(int startRange, int endRange);
	
	/**
	 * 
	 * @param startRange
	 * @param endRange
	 */
	public void printReport(int startRange, int endRange);
}
