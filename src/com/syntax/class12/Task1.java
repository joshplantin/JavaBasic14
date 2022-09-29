package com.syntax.class12;
import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
public static void main(String[]args) {
	//using scanner ask the user to make the size of the array.
	//after ask user to input the int they want to store
	//find the sum of the inputs
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter size of arrays");
	int size=scan.nextInt();
	
	
	int[]arr=new int[size];
	for(int i=0; i<size; i++) {
		System.out.println("Please enter an int number");
		arr[i]=scan.nextInt();
	
	}
	int sum=0;
	for(int num:arr) {
		sum+=num;
	}
	System.out.println(sum);
	
	
	
}
}
