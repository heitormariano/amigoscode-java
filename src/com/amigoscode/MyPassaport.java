package com.amigoscode;

import java.time.LocalDate;

public class MyPassaport {

	public static void main(String[] args) {
		Passaport ukPassaport = new Passaport("123", "England(UK)", LocalDate.of(2026, 1, 20));
		Passaport usPassaport = new Passaport("456", "USA", LocalDate.of(2030, 5, 16));

		System.out.println("UK Passaport");
		System.out.println(ukPassaport.number);
		System.out.println(ukPassaport.country);
		System.out.println(ukPassaport.expiryDate);

		System.out.println("US Passaport");
		System.out.println(usPassaport.number);
		System.out.println(usPassaport.country);
		System.out.println(usPassaport.expiryDate);
	}

	static class Passaport {
		String number;
		String country;
		LocalDate expiryDate;

		Passaport() {

		}

		Passaport(String number, String country, LocalDate expiryDate) {
			this.number = number;
			this.country = country;
			this.expiryDate = expiryDate;
		}
	}
}
