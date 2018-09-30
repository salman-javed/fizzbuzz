package com.equalexperts.fb;

public interface IFizzBuzz {
	
	/**
	 * 
	 * @param num
	 * @return boolean
	 */
	default boolean isFizz(int num) {
		return num % 3 == 0 && num % 5 > 0;
	}

	/**
	 * 
	 * @param num
	 * @return boolean
	 */
	default boolean isBuzz(int num) {
		return num % 5 == 0 && num % 3 > 0;
	}

	/**
	 * 
	 * @param num
	 * @return boolean
	 */
	default boolean isFizzBuzz(int num) {
		return num % 5 == 0 && num % 3 == 0;
	}

	/**
	 * 
	 * @param num
	 * @return String
	 */
	public String tranformNumberToFizzBuzz(int num);

}
