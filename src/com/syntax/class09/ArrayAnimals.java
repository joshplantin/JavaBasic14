package com.syntax.class09;

public class ArrayAnimals {
public static void main(String[]args) {
	
	String[] animals= {"Tiger","Lion","Bear","Buffalo","Cougar"};
	
	for (int i=0; i<animals.length; i++) {
		
		System.out.println(animals[i]);
	}
	
	for (String animals2: animals) {
		System.out.println(animals2);
		
	}
	
}
}
