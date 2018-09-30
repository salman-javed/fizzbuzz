package com.equalexperts.fb;

import com.equalexperts.fb.enums.EnumFizzBuzz;

public class FizzBuzzLucky implements IFizzBuzzLucky {

	@Override
	public String tranformNumberToFizzBuzz(int num) {
			return (isLucky(num) ? EnumFizzBuzz.LUCKY.getLiteral() : (isFizz(num) ?
					EnumFizzBuzz.FIZZ.getLiteral() :
		            (isBuzz(num) ? EnumFizzBuzz.BUZZ.getLiteral() : (isFizzBuzz(num) ? EnumFizzBuzz.FIZZBUZZ.getLiteral():String.valueOf(num)))));
		
	}

}
