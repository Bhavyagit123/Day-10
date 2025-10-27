package com.codegnan.loopingstatements;

import java.util.Scanner;

public class SumNumbersWithUniqueDigits {

	// Method to check if a number has all unique digits
    public static boolean hasUniqueDigits(int num) {
        boolean[] seen = new boolean[10]; // To track digits 0-9

        while (num > 0) {
            int digit = num % 10;
            if (seen[digit]) {
                return false; // Repeated digit found
            }
            seen[digit] = true;
            num /= 10;
        }
        return true; // All digits are unique
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            // Stop on negative number
            if (num < 0) {
                break;
            }

            // Skip numbers with repeated digits
            if (!hasUniqueDigits(num)) {
                continue;
            }

            // Add if digits are unique
            sum += num;
        }

        System.out.println(sum);
        scanner.close();

	}

}
