package com.codegnan.loopingstatements;

import java.util.Scanner;

public class LCMDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // First number
        int B = scanner.nextInt(); // Second number

        int multiple = Math.max(A, B); // Start from the larger number

        // Use do-while loop to find LCM
        do {
            if (multiple % A == 0 && multiple % B == 0) {
                System.out.println(multiple);
                break;
            }
            multiple++;
        } while (true); // Continue until LCM is found

        scanner.close();

	}

}
