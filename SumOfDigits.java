package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: transaction ID (number)
        System.out.print("Enter transaction ID: ");
        int num = scanner.nextInt();

        int sum = 0;
        int temp = num;

        // Calculate sum of digits
        while (temp != 0) {
            int digit = temp % 10; // extract last digit
            sum += digit;          // add digit to sum
            temp = temp / 10;      // remove last digit
        }

        System.out.println(sum);

        scanner.close();

	}

}
