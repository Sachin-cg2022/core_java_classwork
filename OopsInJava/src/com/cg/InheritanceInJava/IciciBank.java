package com.cg.InheritanceInJava;

public class IciciBank extends Bank{

	void calculatingRateOfIntrest() {
		
		rateOfIntrest=principal*time*annualRateOfInterst;
		System.out.println("the Rate If Interest is " + rateOfIntrest);
		
	}
}
