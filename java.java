/*
 * A java program that helps kids learn Divisibility test of numbers by integers in the range of 0-9
 */

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        try (Scanner Scanner = new Scanner(System.in)) {
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
}
