package com.amigoscode;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break

		String[] nomes = { "Ana", "Adrian", "Mary", "Richard" };

//		for (String nome : nomes) {
//			if (nome.equalsIgnoreCase("Mary")) {
//				break; 
//			}
//			System.out.println(nome);
//		}
		
		for (String nome : nomes) {
			if (nome.startsWith("A")) {
				continue; 
			}
			System.out.println(nome);
		}
	}
}
