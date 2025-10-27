package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int upperLimit=scanner.nextInt();
		int currentNumber=1;// Iterator from 1 to n
		int palindromeCount=0;// Counter to store number of palindrome.
		while(currentNumber<=upperLimit) {
			int originalNumber=currentNumber;// Keep the original number.
			int numberToReverse=originalNumber;// temporary variable for reversing.
			int reversedNumber=0;// Store reversed number.
			while(numberToReverse>0) {
				int lastDigit=numberToReverse%10;
				reversedNumber=reversedNumber*10+lastDigit;
				numberToReverse=numberToReverse/10;//remove last digit
				}
			// check if the original and reversednumbers are the same.
			if(originalNumber==reversedNumber) {
				palindromeCount++;//Increment the count if palindrome.
			}
			currentNumber++;//move to the next number
			}
		System.out.println(palindromeCount);
		
		

	}

}
