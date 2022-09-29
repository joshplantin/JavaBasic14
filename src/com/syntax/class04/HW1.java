package com.syntax.class04;
import java.util.Scanner;
public class HW1 {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Do you have a diploma? True or false");
	boolean dip=scanner.nextBoolean();
	if(dip) {
		System.out.println("Congratulations");
	}
	else {
		System.out.println("You should get a degree");
	}
	System.out.println("What is your gpa?");
	double gpa=scanner.nextDouble();
	if (gpa>=3.5) {
		System.out.println("You are eligible for a scholarship");
		}
	else {
		System.out.println("You should have studied harder");
	}
}
}
