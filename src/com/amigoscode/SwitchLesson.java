package com.amigoscode;

import java.util.Scanner;

public class SwitchLesson {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Inform your gender, please:");
		String gender = leitor.next();

		switch (gender.toUpperCase()) {
		case "MALE":
			System.out.println("I am a male");
			break;
		case "FEMALE":
			System.out.println("I am a female");
			break;
		default:
			System.out.println("Unknow gender");
		}
	}
}
