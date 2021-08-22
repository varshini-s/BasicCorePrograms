package com.bridgelabz.basiccoreprograms;

public class Factors {

	public static void main(String[] args) {
		
		int number=21;
		
		 for(int index = 2; index*index<=number; index++) {
	         while(number%index == 0) {
	            System.out.println(index+" ");
	            number = number/index;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	

	}

}
}
