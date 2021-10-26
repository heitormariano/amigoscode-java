package com.amigoscode;

import java.util.Scanner;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		int count = 0;
		while (count < 10) {
			System.out.println("Count: " + count);
			count++;
		}

		boolean finish = false;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Digit a number. Inform 0 to finish");
			int number = scanner.nextInt();

			if (number != 0) {
				System.out.println("Number: " + number);
			} else {
				finish = true;
				System.out.println("Finish");
			}

		} while (!finish);
	}
}
