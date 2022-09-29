package com.syntax.class11;

import java.util.Arrays;

public class ArrayDemo3 {
public static void main(String[]args) {
	
	
	int [] arr=new int[10];
	
	int start=11;
	for(int i=0; i<arr.length; i++) {
		
		arr[i]=start;
		start--;
	}
	System.out.println(Arrays.toString(arr)); //print all elements of a array without for loop
	
	int sum=0;  //getting the sum of elements of an array
	for(int num: arr) {
		
		sum+=num;
		
		
	}
System.out.println(sum);	
}
}
