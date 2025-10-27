package com.codegnan.loopingstatements;

import java.util.Scanner;

public class SmallestPowerFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Target number
        int K = scanner.nextInt(); // Base number

        int i = 1;            // Exponent
        long power = 1;       // K raised to i

        // Keep multiplying K until power >= N
        while (true) {
            power = (long) Math.pow(K, i);
            if (power >= N) {
                System.out.println(i);
                break;
            }
            i++;
        }

        scanner.close();

	}

}
