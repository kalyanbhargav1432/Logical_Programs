package Assignment_4;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int number;
		int reverse = 0;
		int remainder = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = scanner.nextInt();
		while (number != 0) {
			remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number / 10;
		}
		System.out.println("reverse is :" + reverse);
	}
}
