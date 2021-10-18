package com.amigoscode;

public class PrimitiveReferenceTypes {

	public static void main(String[] args) {
		int a = 10;
		int b = a;
		a = 100;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		Person hector = new Person("Hector");
		Person alex = hector;

		System.out.println("before changing hector");
		System.out.println("hector name: " + hector.name);
		System.out.println("alex name: " + alex.name);

		alex.name = "Alex Love";
		System.out.println("after changing hector");
		System.out.println("hector name: " + hector.name);
		System.out.println("alex name: " + alex.name);
	}

	static class Person {
		String name;

		Person(String name) {
			this.name = name;
		}
	}
}
