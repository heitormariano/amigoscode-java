package com.amigoscode;

import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {
		char[] letters = { 'A', 'A', 'B', 'C', 'D', 'D', 'D' };
		System.out.println("All letters:");
		Arrays.asList(letters).forEach(elem -> System.out.println(elem));
		System.out.println();

		for (char elem : letters) {
			System.out.println("Letter " + elem);
			System.out.println("Occurrences: " + countOccurrences(elem, letters));
		}
	}

	public static int countOccurrences(char searchLetter, char[] letters) {
		int count = 0;
		for (char letter : letters) {
			if (letter == searchLetter) {
				count++;
			}
		}
		return count;
	}
}
