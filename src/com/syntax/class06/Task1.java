package com.syntax.class06;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade on your quiz");
		int quiz = scan.nextInt();
		System.out.println("Please enter your grade on your midterm");
		int mid = scan.nextInt();
		System.out.println("Please enter your grade on your final");
		int finals = scan.nextInt();

		int average = (quiz + mid + finals) / 3;
		String grade = null;

		if (average >= 90 && average <= 100) {
			grade = "A";
		} else if (average >= 70 && average <= 89) {
			grade = "B";
		} else if (average >= 50 && average <= 69) {
			grade = "C";
		} else if (average >= 0 && average <= 49) {
			grade = "D";
		} else {
			System.out.println("Please enter valid grades");
		}

		System.out.println(grade);

	}
}
