package com.syntax.class12;

public class Fibonacci {
public static void main(String[] args) {
	int previous=0;
	int current=0;
	int nextNum=0;
	System.out.println(previous);
	System.out.println(current);
	
	for(int i=0; i<8; i++) {
		nextNum=previous+current;
		System.out.println(nextNum);
		previous=current;
		current=nextNum;
		
		
	}
	
}
}
