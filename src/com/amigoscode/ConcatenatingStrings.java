package com.amigoscode;

public class ConcatenatingStrings {

	public static void main(String[] args) {
		String name = "Alex";
		String surname = "White";
		String fullName = name + " " + surname;

		System.out.println("Full name: " + fullName);

		String fullNameConcat = name.concat(" ").concat(surname);
		System.out.println("Full name (2): " + fullNameConcat);
	}
}
