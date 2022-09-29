package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		System.out.println("Please enter your name");

		String name = scan.next();

		System.out.println("Nice to meet you " + name);

		System.out.println("Please enter your age");
		
		int age = scan.nextInt();
		
		System.out.println(name + " is " + age + " years old");

		System.out.println("How much money do you have "+name+"?");
		
		double money=scan.nextDouble();
		
		System.out.println(name+" has "+money+" in his bank account.");
		
	}
}
