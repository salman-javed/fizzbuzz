package com.equalexperts.fb;



public class FizzBuzzApp 
{
    public static void main( String[] args ){
    	IFizzBuzzReport fbr = new FizzBuzzReport(new FizzBuzzLucky());
		fbr.printReport(1, 20);
    }
}
