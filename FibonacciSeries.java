package com.codegnan.controlstatements;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " "); // print first term

        if (n > 1) {
            System.out.print(b + " "); // print second term
        }

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        scanner.close();

	}

}
