package com.syntax.class08;

import java.util.Scanner;

public class RecapHW {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String answer;
	
	do {
	System.out.println("Did you get a job?");
	answer=scan.next();
	
	}while(!answer.equalsIgnoreCase("yes"));
	
	System.out.println("Congratulations!!!");
	
	}
}