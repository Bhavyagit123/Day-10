package com.codegnan.loopingstatements;

import java.util.Scanner;

public class SumNotDivisibleByDigitSum {

	// Method to calculate the sum of digits of a number
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input count
        int N = scanner.nextInt();
        int sum = 0;

        // Process each number
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            // Stop on zero
            if (num == 0) {
                break;
            }

            int dSum = digitSum(num);

            // Skip numbers divisible by digit sum
            if (dSum != 0 && num % dSum == 0) {
                continue;
            }

            // Add to sum if not divisible
            sum += num;
        }

        // Output the result
        System.out.println(sum);
        scanner.close();

	}

}
