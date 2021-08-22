package com.bridgelabz.basiccoreprograms;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		//variables
		int nValue=5;
		int numerator,denominator;
		double harmonicValue=0;
		
		numerator=1;
		
		if(nValue!=0)
		{
			for(int index=1;index<=nValue;index++)
			{
				denominator=index;
				harmonicValue=harmonicValue+(double)numerator/denominator;
				
			}
			
			System.out.println("Nth Harmonic value is: "+harmonicValue);
		}
		else
		{
			System.err.println("N value cannot be 0");
		}

	}

}
