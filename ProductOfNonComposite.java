package com.codegnan.loopingstatements;

import java.util.Scanner;

public class ProductOfNonComposite {

	// Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 0 and 1 are not prime
        if (num == 2) return true;   // 2 is prime
        if (num % 2 == 0) return false; // even numbers > 2 are not prime
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of elements
        long product = 1;     // Product of non-composite numbers

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            if (num == 0) {
                break; // Stop when zero is encountered
            }

            // Non-composite means: 1 or prime
            if (num == 1 || isPrime(num)) {
                product *= num;
            } else {
                continue; // Skip composite numbers
            }
        }

        System.out.println(product);
        scanner.close();

	}

}
