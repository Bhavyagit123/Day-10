package com.codegnan.loopingstatements;

import java.util.Scanner;

public class TriangularNumbersGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Input number
        int n = 1;            // Counter for term number
        int triangular = 0;   // To store each triangular number

        // Generate triangular numbers using while loop
        while (true) {
            triangular = n * (n + 1) / 2; // Formula for nth triangular number
            if (triangular > N) {
                break; // Stop when triangular number exceeds N
            }
            System.out.print(triangular + " ");
            n++;
        }

        scanner.close();

	}

}
