package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your name");
	String name=input.next();
	System.out.println("Hello "+name);
	System.out.println("What is your last name?");
	String lastname=input.next();
	System.out.println("Hello "+name+" "+lastname);
	
	
	
}
	
	
}
