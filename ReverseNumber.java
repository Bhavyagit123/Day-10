package com.codegnan.controlstatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: number to reverse
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversed = 0;
        int temp = num;

        // Reverse the digits
        while (temp != 0) {
            int digit = temp % 10;          // extract last digit
            reversed = reversed * 10 + digit; // build reversed number
            temp = temp / 10;               // remove last digit
        }

        System.out.println(reversed);

        scanner.close();

	}

}
