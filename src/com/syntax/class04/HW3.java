package com.syntax.class04;
import java.util.Scanner;
public class HW3 {
public static void main(String[]args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter amount of loan needed");
	int loan=scan.nextInt();
	if (loan<=200000) {
		System.out.println("Loan amount is approved");
	}
	else {
		System.out.println("Loan amount denied");
	}
	
}
}
