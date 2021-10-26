package com.amigoscode;

import java.util.Arrays;

public class Loops {

	public static void main(String[] args) {
		String[] languages = { "Python", "JavaScript", "Java", "C++" };

		for (int i = 0; i < languages.length; i++) {
			System.out.println(languages[i]);
		}

		System.out.println("Enhanced for loop");
		for (String language : languages) {
			System.out.println(language);
		}

		System.out.println("Numbers");
		int[] numbers = { 10, 20, 30, 40 };
		Arrays.stream(numbers).forEach(System.out::println);
	}
}
