package com.syntax.class12;
import java.util.Scanner;
public class Array2dTask3 {
public static void main(String[]args) {
	
	int[][] arr= {
			{10,10,10,20},
			{25,30,54},
			{20,30}
	};
	int sum=0;
	
	for(int[] ar:arr) {
		for(int num:ar) {
			sum+=num;
		}
	}
	
}
}
