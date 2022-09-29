package com.syntax.class04;

public class NestedIfCondition {
	public static void main(String[] args) {

		int time = 8;
		String day = "Monday";

		if (day.equals("Monday")) {

			if (time > 7) {
				System.out.println("Lets go to the office");

			} else {
				System.out.println("Lets wait until 7");
			}
		}

	}
}
