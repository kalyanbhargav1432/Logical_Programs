package Assignment_4;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int number;
		int i = 1;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = scanner.nextInt();
		while (i < number) {
			if (number % i == 0) {
				sum += i;
			}
			i++;
		}
		if (sum == number) {
			System.out.println(i + " is a perfect number");
		} else
			System.out.println(i + " is not a perfect number");
	}
}
