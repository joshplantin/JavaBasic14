package com.syntax.class10;
import java.util.Array;
public class Array2DTask2 {
public static void main(String[]args) {
	
	String[][] grades=	{
		{"Josh","Joe","John","Jack"},
		{"A","B","C","D"}
		
		
	};
	
	System.out.println(grades[0][0]+"="+grades[1][0]);
	
	for(int r=0; r<grades.length; r++) {
		for(int c=0; c<grades[r].length; c++) {
			System.out.println(grades[r][c]);
		}
	}
	
	for(String[] singleArray:grades) {
		
		for (String el:singleArray) {
			
			System.out.println(el);
		}
	}
	//
}
}
