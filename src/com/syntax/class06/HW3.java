package com.syntax.class06;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first value");
		int num1 = scan.nextInt();
		System.out.println("Please enter second value");
		int num2 = scan.nextInt();
		System.out.println("Please enter a operator");
		char operator = scan.next().charAt(0);
		int result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Please enter valid numbers");
			break;
		}
		System.out.println("Result=" + result);

	}
}
