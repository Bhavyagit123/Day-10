package com.codegnan.loopingstatements;

import java.util.Scanner;

public class PalindromicNumbersCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        int N = sc.nextInt(); // Input number
		        int count = 0;        // To count palindromic numbers
		        int num = 1;          // Start from 1

		        while (num <= N) {
		            if (isPalindrome(num)) {
		                count++;
		            }
		            num++;
		        }

		        System.out.println(count);
		        sc.close();
		    }

		    // Method to check if a number is palindrome
		    public static boolean isPalindrome(int n) {
		        int original = n;
		        int reverse = 0;

		        while (n > 0) {
		            int digit = n % 10;
		            reverse = reverse * 10 + digit;
		            n /= 10;
		        }

		        return original == reverse;
		    }
		


	}


