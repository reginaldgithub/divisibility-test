/*
 * This is a java program that checks whether a given integer is divisible by integers in the range of 0-9
 */

import java.util.Scanner;
public class DivisibilityChecker {
	
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner Scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = Scanner.nextInt();

	        for (int i = 0; i <= 9; i++) {
	            if (number % i == 0) {
	                System.out.println(number + " is divisible by " + i);
	            } else {
	                System.out.println(number + " is not divisible by " + i);
	            }
	        }
	    }
	}

