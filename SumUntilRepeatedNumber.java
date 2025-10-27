package com.codegnan.loopingstatements;

import java.util.HashSet;
import java.util.Scanner;

public class SumUntilRepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        HashSet<Integer> seen = new HashSet<>(); // To keep track of entered numbers
        int sum = 0;  // To store the total sum

        while (true) {
            int num = scanner.nextInt(); // Read input number

            if (num == 0) { // Stop if user enters 0
                break;
            }

            sum += num; // Add number to sum

            if (seen.contains(num)) { // Check for repetition
                break; // Stop after including repeated number
            } else {
                seen.add(num); // Store number in set
            }
        }

        System.out.println(sum); // Output final sum
        scanner.close();

	}

}
