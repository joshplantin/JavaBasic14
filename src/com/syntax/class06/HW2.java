package com.syntax.class06;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade = scan.nextLine();
		String exp;
		switch (grade) {
		case "A":
			exp = "A is excellent";
			break;
		case "B":
			exp = "B is good";
			break;
		case "C":
			exp = "C is average";
			break;
		case "D":
			exp = "D is bad";
			break;

		default:
			exp = "Please enter a valid grade";
			break;

		}
		System.out.println("You have a grade of " + grade + " and " + exp);

	}
}
