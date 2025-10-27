package com.codegnan.loopingstatements;

import java.util.Scanner;

public class SumUntilArmstrong {

	// Method to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        if (num == 0) return false; // 0 is not considered Armstrong here
        int original = num;
        int digits = 0;
        int temp = num;
        
        // Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        int sum = 0;
        temp = num;
        
        // Calculate sum of digits^digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        return sum == original;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // Number of elements
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            
            if (num == 0) {
                continue; // Skip zeros
            }
            
            if (isArmstrong(num)) {
                break; // Stop when an Armstrong number is found
            }
            
            sum += num; // Add to sum otherwise
        }
        
        System.out.println(sum);
        
        scanner.close();
		

	}

}
