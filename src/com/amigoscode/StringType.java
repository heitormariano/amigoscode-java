package com.amigoscode;

public class StringType {

	public static void main(String[] args) {
		String name = "Amigoscode";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		System.out.println(name.charAt(0));
		System.out.println(name.charAt(name.length() - 1));

		System.out.println(name.contains("Amig"));
		String code = "code";
		System.out.println(name.contains(code));

		boolean result = name.equals(code);
		System.out.println("Result: " + result);
	}
}
