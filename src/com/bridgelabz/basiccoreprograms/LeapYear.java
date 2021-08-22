package com.bridgelabz.basiccoreprograms;

public class LeapYear 
{

	public static void main(String[] args) 
	
	{
		int yearToCheck=1882;
		boolean isLeapYear=false;
		
		if(Integer.toString(yearToCheck).length()==4)
		{
			if((yearToCheck%4==0 && yearToCheck%100!=0)||(yearToCheck%400==0))
			{
				isLeapYear=true;
			}
		}
		else
		{
			System.err.println("Input is not a 4 digit number");
		}
		
		if(isLeapYear==true)
		{
			System.out.println("Given year:"+yearToCheck+" is a leap year");
		}
		else
		{
			System.out.println("Given year:"+yearToCheck+" is not a leap year");
		}
		


	}

}
