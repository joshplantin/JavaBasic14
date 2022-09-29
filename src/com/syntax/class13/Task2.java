package com.syntax.class13;

public class Task2 {
public static void main(String[] args) {
	/*
	 * Create a String that should be combination of letters, numbers
	 * and special characters. Find out how many Alphanumeric
	 * characters are there in the String.
	 */
	
	String str="1203598617234dFOKJSDOSIJD)(#%*@&()@%";
	String alpha=str.replaceAll("[^A-z]", "");
	System.out.println(alpha.length());
	
}
}
