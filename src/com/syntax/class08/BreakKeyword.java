package com.syntax.class08;

import java.util.Scanner;

public class BreakKeyword {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item = scan.nextLine();

		System.out.println("What is the price of the item");
		double price = scan.nextDouble();

		double money;
		double total;

		do {
			System.out.println("How much money do you have?");
			money = scan.nextDouble();

			total += money; // accumulate all money
			double need;
			double change;
			if (total < price) {
				need = price - total;
				System.out.println("You are short $" + need);

			} else if (total > price) {
				change = total - price;
				System.out.println("Your change is $" + change);
				break;
			}
		} while (total != price);

	}
}
