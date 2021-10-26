package com.amigoscode;

public class MyClass {

	public static void main(String[] args) {
		Lens lensOne = new Lens("Sony", "80mm", true);
		Lens lensTwo = new Lens("Canon", "24-70mm", false);

		System.out.println("Lens 01");
		System.out.println(lensOne.brand);
		System.out.println(lensOne.focalLength);
		System.out.println(lensOne.isPrime);

		System.out.println("Lens 02");
		System.out.println(lensTwo.brand);
		System.out.println(lensTwo.focalLength);
		System.out.println(lensTwo.isPrime);
	}

	static class Lens {
		String brand;
		String focalLength;
		boolean isPrime;

		Lens() {

		}

		Lens(String brand, String focalLength, boolean isPrime) {
			this.brand = brand;
			this.focalLength = focalLength;
			this.isPrime = isPrime;
		}
	}
}
