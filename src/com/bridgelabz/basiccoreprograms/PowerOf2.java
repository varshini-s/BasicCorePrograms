package com.bridgelabz.basiccoreprograms;

public class PowerOf2 {
	
	public static void main(String args[]) 
	{
		//Variables
		int nValue=0,twoPowerN=1,yearToCheck=0;
		boolean isLeapYear=false;
		
		//Command line input
		nValue=Integer. parseInt(args[0]);
		
		if (nValue>=0 && nValue<31)
		{
			
			for(int index=1;index<=nValue;index++)
			{
				twoPowerN=twoPowerN*2;
				System.out.println("2 power "+index+" is "+twoPowerN);
			}
		
			yearToCheck=twoPowerN;
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
		else
		{
			System.err.println("The int value overflows");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
