package com.codegnan.controlstatements;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: number to check
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int result = 0;
        int digits = 0;

        // Count number of digits
        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Calculate sum of digits raised to the power of number of digits
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check Armstrong condition
        if (result == originalNum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }

        scanner.close();

	}

}
