package com.codegnan.controlstatements;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: number to find factorial of
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = 1; // using long to handle large results

        // Calculate factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println(factorial);

        scanner.close();

	}

}
