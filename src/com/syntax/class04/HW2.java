package com.syntax.class04;
import java.util.Scanner;
public class HW2 {
public static void main(String[]args) {
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter mortage rate");
	double rateapproval=scan.nextDouble();
	if(rateapproval>4.5) {
		System.out.println("Do not buy a house");
	}
	else {
		System.out.println("You should consider buying");}
	
		System.out.println("What is the price of the home you are considering?");
		double houseprice=scan.nextDouble();
		if(houseprice>200000) {
			System.out.println("You should take out a loan");
		}
		else {
			System.out.println("You should pay cash");
		}
		

	}
	
}

