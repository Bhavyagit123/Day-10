package com.codegnan.loopingstatements;

import java.util.Scanner;

public class SquareNumbersDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Upper limit for square value
        int M = scanner.nextInt(); // Maximum number of squares to generate

        int i = 1;       // Starting number
        int count = 0;   // Count of squares generated

        do {
            int square = i * i; // Compute square

            if (square > N || count >= M) { // Stop conditions
                break;
            }

            System.out.print(square + " ");
            count++;
            i++;
        } while (true); // Continue until one of the stop conditions is met

        scanner.close();

	}

}
