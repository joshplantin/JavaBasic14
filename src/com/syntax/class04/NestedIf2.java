package com.syntax.class04;

public class NestedIf2 {
	public static void main(String[] args) {

		double moneyInMyAccount = 100000;
		String season = "Spring";

		if (season.equals("Spring")) {

			if (moneyInMyAccount > 30000) {
				System.out.println("Lets go on vacation");
			} else {
				System.out.println("I need to save more");
			}
		}

	}
}