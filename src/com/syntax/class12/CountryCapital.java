package com.syntax.class12;

import java.util.Arrays;
import java.util.Scanner;

public class CountryCapital {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of countries you want to capture");
		int size = scan.nextInt();
		String[] countries = new String[size];
		String[] capitals = new String[size];
		scan.nextLine();
		for (int a = 0; a < size; a++) {
			System.out.println("Please enter the country name");
			countries[a] = scan.nextLine();
			System.out.println("Please enter the capital of that country");
			capitals[a] = scan.nextLine();
		}
		
		System.out.println(Arrays.toString(countries));
		System.out.println(Arrays.toString(capitals));
		
		for (int i=0; i<size; i++) {
			System.out.println("The country "+countries[i]+" has the capital of "+capitals[i]);
		}
		
		for(String country: countries) {
			System.out.println(country);
		}
		for(String capital: capitals) {
			System.out.println(capital);
		}

	}

}
