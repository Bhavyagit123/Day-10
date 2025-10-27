package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: the PIN number
        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        int count = 0;
        int temp = pin;

        // Count the number of digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        System.out.println(count);

        scanner.close();

	}

}
