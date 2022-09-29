package com.syntax.class04;
import java.util.Scanner;
public class HW5 {
public static void main(String[]args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Do you have a credit card? True or False");
	boolean cc=scan.nextBoolean();
	if (cc==true){
		System.out.println("What is the balance on the card?");
	int balance=scan.nextInt();
	if(balance>1000) {
		System.out.println("Pay off immediately");
	}
	else {System.out.println("You can spend more");
	}
	}
	
else{
		System.out.println("We would like to offer you a credit card");
	}
	
	
}
}
