package com.codegnan.controlstatements;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input number of days
        int n = scanner.nextInt();
        int[] prices = new int[n];

        // Input prices
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int maxLength = 1; // Minimum possible sequence length
        int currentLength = 1;

        // Loop to track increasing sequences
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                currentLength++; // continues increasing
            } else {
                currentLength = 1; // reset when sequence breaks
            }

            // track the maximum length found
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println(maxLength);
        scanner.close();

	}

}
