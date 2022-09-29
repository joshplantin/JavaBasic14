package com.syntax.class11;

import java.util.Arrays;

public class ArrayDemo2 {
public static void main(String[]args) {
		String []dress=new String[] {"Pink Dress","Cocktail","Summer Dress","Night Dress",
				"Night Dress"};
	System.out.println(dress.length);
	
	for(int i=0; i<dress.length; i++) {
		System.out.println("Let try "+dress[i]);
		
	}
	
	for(String dresses: dress) {
		System.out.println(dresses);  //enhanced for loop
	}
	
	System.out.println(Arrays.toString(dress)); //print elements of array without a loop
	
}
}
