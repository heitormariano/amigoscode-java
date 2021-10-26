package com.amigoscode;

public class ArraysPart2 {

	public static void main(String[] args) {
		// indexes
		int[] myNumbers = { 1, 2, 3, 4, 5, 6 };

		int one = myNumbers[0];
		int four = myNumbers[3];
		System.out.println("One: " + one + " - Four: " + four);

		int last = myNumbers[myNumbers.length - 1];
		System.out.println("Last: " + last);
	}
}
