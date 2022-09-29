package com.syntax.class13;

public class StringDemo2 {
public static void main(String[] args) {
	
	//to find all indexes of a character of a string
	String str="Thor love and thunder";
	for(int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='o') {
				System.out.println(i);
			}
	}
	StringUtils strUtils=new StringUtils(); //
	strUtils.printAllIndexes(str, 'e');

	
	
}
}
