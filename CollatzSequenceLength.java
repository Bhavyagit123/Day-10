package com.codegnan.controlstatements;

import java.util.Scanner;

public class CollatzSequenceLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: starting number
        int N = scanner.nextInt();

        int count = 1; // include the starting number itself

        // Generate the Collatz sequence until it becomes 1
        while (N != 1) {
            if (N % 2 == 0) {
                N = N / 2;      // even: divide by 2
            } else {
                N = 3 * N + 1;  // odd: 3n + 1
            }
            count++; // count each term
        }

        // Output total number of terms
        System.out.println(count);

        scanner.close();

	}

}
