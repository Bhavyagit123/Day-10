package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: single integer N
        int N = scanner.nextInt();
        int sum = 0;

        // Loop through all numbers from 2 to N
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                sum += i; // Add prime number to sum
            }
        }

        // Output the total sum of primes
        System.out.println(sum);

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;

	}

}
