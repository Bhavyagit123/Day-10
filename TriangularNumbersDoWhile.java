package com.codegnan.loopingstatements;

import java.util.Scanner;

public class TriangularNumbersDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Input number

        int n = 1;             // Term index
        int triangular;        // To store triangular number

        do {
            triangular = n * (n + 1) / 2;  // Formula for nth triangular number
            if (triangular <= N) {
                System.out.print(triangular + " ");
            }
            n++;
        } while (triangular <= N);  // Continue until triangular number exceeds N

        scanner.close();

	}

}
