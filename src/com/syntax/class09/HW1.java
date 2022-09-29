package com.syntax.class09;

public class HW1 {
public static void main(String[]args) {
	
	int[] numbers = {10,20,30,40,50,60,70,80,90,100};
	int sum=0;
	
	System.out.print("Sum of numbers in this array= ");
	
	for (int i=0; i<numbers.length; i++){
		sum+=numbers[i];
	}
	System.out.println(sum);
	
	sum=0;
	
	for(int number: numbers) {
		sum+=number;
		System.out.println(sum);
	}
}
}
