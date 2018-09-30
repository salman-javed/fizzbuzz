package com.equalexperts.fb;

public interface IFizzBuzzLucky extends IFizzBuzz {

	default boolean isLucky(int num) {
		return String.valueOf(num).contains("3");
	}
}
