package Assignment_4;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int FirstNumber = 0;
		int SecondNumber = 1;
		int Result;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int UserNumber = scanner.nextInt();
		while (count < UserNumber) {
			System.out.print("Fibonacci Number:" + count + " - > ");
			System.out.println(FirstNumber + " ");
			Result = FirstNumber + SecondNumber;
			FirstNumber = SecondNumber;
			SecondNumber = Result;
			count++;
			
		}
	}
}
