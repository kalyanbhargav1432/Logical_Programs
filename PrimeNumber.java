package Assignment_4;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int number;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(number + " is a prime number");
		} else
			System.out.println(number + " is  not a prime number");
	}
}
