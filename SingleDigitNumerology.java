package com.codegnan.loopingstatements;

import java.util.Scanner;

public class SingleDigitNumerology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: single integer N
        int N = scanner.nextInt();

        // Repeat digit-sum process until a single digit remains
        while (N >= 10) {  // Continue while number has more than one digit
            int sum = 0;
            while (N > 0) {
                sum += N % 10; // Add last digit
                N /= 10;       // Remove last digit
            }
            N = sum; // Replace N with the sum of its digits
        }

        // Output the final single-digit result
        System.out.println(N);

        scanner.close();

	}

}
