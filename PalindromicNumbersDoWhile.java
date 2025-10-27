package com.codegnan.loopingstatements;

import java.util.Scanner;

public class PalindromicNumbersDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Input number

        int num = 1;          // Start from 1
        int count = 0;        // To count palindromic numbers

        do {
            if (isPalindrome(num)) {
                count++;
            }
            num++;
        } while (num <= N); // Continue until num exceeds N

        System.out.println(count);
        scanner.close();
    }

    // Method to check if a number is a palindrome
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
