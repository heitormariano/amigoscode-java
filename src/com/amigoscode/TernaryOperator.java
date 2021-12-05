package com.amigoscode;

public class TernaryOperator {

	public static void main(String[] args) {
		int age = 25;
		String msgAdult = "I am an adult";
		String msgNotAdult = "I am not an adult";

		String msg = age >= 18 ? msgAdult : msgNotAdult;
		System.out.println(msg);
	}
}
