package com.capgemini.day2;

public class Interest {
       public static double simpleInterestCalculation(double principle, double years, double rate) {
		double si;
		si=(principle*years*rate)/100;
		return si;
	}

	public static double compoundInterestCalculation(double principle, double years, double rate) {
		double ci;
		ci=principle * Math.pow(1.0+rate/100.0, years) - principle;
		return ci;
	}
}