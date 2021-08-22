package com.bridgelabz.basiccoreprograms;

public class SwapTwoNumbers 
{

	public static void main(String[] args) 
	{
		int number1=10,number2=20,tempVariable;
		
		System.out.println("Numbers before swaping are  number1: "+number1+" number2 "+number2);
		
		tempVariable=number1;
		number1=number2;
		number2=tempVariable;
		
		System.out.println("Numbers after swaping are  number1: "+number1+" number2 "+number2);

	}

}
