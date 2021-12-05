package com.amigoscode;

import java.time.LocalDate;

public class ReferenceTypes {

	public static void main(String[] args) {
		String name = new String("Heitor");
		System.out.println("Name: " + name);
		System.out.println("Name modified: " + name.toUpperCase());

		LocalDate now = LocalDate.now();
		System.out.println("variable: " + now);
		System.out.println("Month: " + now.getMonth());
	}
}
