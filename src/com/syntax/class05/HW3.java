package com.syntax.class05;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 1000");
		int num = scan.nextInt();
		if (num >= 1 && num <= 10) {
			System.out.println("Number is small");
		} else if (num >= 11 && num <= 100) {
			System.out.println("Number is medium");
		} else if (num >= 101 && num <= 1000) {
			System.out.println("Number is large");
		} else {
			System.out.println("Invalid");
		}
	}
}
