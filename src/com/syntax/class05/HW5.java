package com.syntax.class05;

import java.util.Scanner;

public class HW5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month = scan.next();
		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			System.out.println("Winter");
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			System.out.println("Spring");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			System.out.println("Summer");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			System.out.println("Fall");
		} else {
			System.out.println("Please enter a valid month");
		}

	}
}
