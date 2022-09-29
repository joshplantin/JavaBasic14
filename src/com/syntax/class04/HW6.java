package com.syntax.class04;
import java.util.Scanner;
public class HW6 {
public static void main(String[]args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter number of years worked");
	int years=scan.nextInt();
	
	if(years>5) {
		System.out.println("You are eligible for the bonus");
	System.out.println("Please enter annual salary");
	int salary=scan.nextInt();
	if(salary>50000) {
		System.out.println("Your bonus will be $5000");
	}
	else {
		System.out.println("Your bonus will be $3000");
	}
	}
	else {
		System.out.println("You are not eligible for the bonus");
	}
	
}
	
	
}
