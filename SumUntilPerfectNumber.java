package com.codegnan.loopingstatements;

import java.util.Scanner;

public class SumUntilPerfectNumber {

	// Method to check if a number is perfect
    public static boolean isPerfect(int num) {
        if (num <= 0) return false; // Negative or zero can't be perfect
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // Count of numbers
        int sum = 0;           // Sum of non-negative numbers before perfect number

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            if (num < 0) {
                continue; // Skip negative numbers
            }

            if (isPerfect(num)) {
                break; // Stop when perfect number is found
            }

            sum += num; // Add non-negative, non-perfect numbers
        }

        System.out.println(sum);
        scanner.close();

	}

}
