package com.bridgelabz.basiccoreprograms;

public class LarestAmongThreeNumbers 
{

	public static void main(String[] args) 
	{
		
		//variables
		int number1=1;
		int number2=5;
		int number3=4;
		
		if(number1>number2)
		{
			if(number1>number3)
			{
				System.out.println(number1+"is largest of all three numbers");
			}
			else
			{
				System.out.println(number3+"is largest of all three numbers");

			}
		}
		else
		{
			if(number2>number3)
			{
				System.out.println(number2+"is largest of all three numbers");
	
			}
			else
			{
				System.out.println(number3+"is largest of all three numbers");

			}
		}
		

	}

}
