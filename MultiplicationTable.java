package com.codegnan.controlstatements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        // Input: number for which multiplication table is required
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Print multiplication table up to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        scanner.close();

	}

}
