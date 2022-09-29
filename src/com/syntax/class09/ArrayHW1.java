package com.syntax.class09;

public class ArrayHW1 {
public static void main(String[]args) {
		String[] cars= new String[6];
		cars[0]="Camaro";
		cars[1]="Bronco";
		cars[2]="S10";
		cars[3]="Rav4";
		cars[4]="F-150";
		cars[5]="Cherokee";
		
		System.out.println(cars.length);
		
	for (int i=0; i<cars.length; i++) {
		System.out.println(cars[i]);
	}
	
	for (String car: cars) {
		System.out.println(car);
	}
	
}
}
