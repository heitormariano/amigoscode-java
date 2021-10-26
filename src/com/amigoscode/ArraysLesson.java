package com.amigoscode;

import java.util.Arrays;

public class ArraysLesson {

	public static void main(String[] args) {
		int[] numbers = new int[4];
		System.out.println("Antes: " + Arrays.toString(numbers));

		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;

		System.out.println("Depois: " + Arrays.toString(numbers));

		boolean[] booleanList = new boolean[2];
		System.out.println("Boolean list: " + Arrays.toString(booleanList));

		String[] words = new String[2];
		System.out.println("String list: " + Arrays.toString(words));

		int[] myNumbers = { 1, 2, 3, 4, 5, 6 };
		for (int num : myNumbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Length: " + myNumbers.length);

		String[] names = { "John", "Hector", "Keyth", "Lisa" };
		System.out.println(Arrays.toString(names));
		System.out.println("Length: " + names.length);
	}
}
