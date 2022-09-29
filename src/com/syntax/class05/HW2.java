package com.syntax.class05;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What day of the week is today? Answer using 1-7 ex. 1=mon 7-sun");
		int day = scan.nextInt();
		if (day >= 1 && day <= 5) {
			System.out.println("Today is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is the weekend");
		} else {
			System.out.println("Invalid");
		}
	}
}
