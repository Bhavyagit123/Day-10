package com.codegnan.loopingstatements;

import java.util.Scanner;

public class ArmstrongNumberDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Input number
        int original = N;     // Store original number for comparison

        // Step 1: Count the number of digits
        int temp = N;
        int digits = 0;
        do {
            digits++;
            temp /= 10;
        } while (temp > 0);

        // Step 2: Calculate sum of digits raised to the power of digits
        int sum = 0;
        temp = N;
        do {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        } while (temp > 0);

        // Step 3: Compare and print result
        if (sum == original)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

        scanner.close();

	}

}
