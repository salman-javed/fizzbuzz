package com.equalexperts.fb;

import com.equalexperts.fb.enums.EnumFizzBuzz;

public class FizzBuzz implements IFizzBuzz {

	@Override
	public String tranformNumberToFizzBuzz(int num) {
		return (isFizz(num) ? EnumFizzBuzz.FIZZ.getLiteral()
				: (isBuzz(num) ? EnumFizzBuzz.BUZZ.getLiteral()
						: (isFizzBuzz(num) ? EnumFizzBuzz.FIZZBUZZ.getLiteral() : String.valueOf(num))));

	}


}
