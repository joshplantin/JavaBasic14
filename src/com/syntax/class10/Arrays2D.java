package com.syntax.class10;

public class Arrays2D {
public static void main(String[]args) {
	
	int[][] bigArray=new int[3][4];
	bigArray[0][0]=10;
	bigArray[0][1]=20;  //row 1
	bigArray[0][2]=30;
	bigArray[0][3]=40;
	
	bigArray[1][0]=100;
	bigArray[1][1]=200;  //row 2
	bigArray[1][2]=300;
	bigArray[1][3]=400;
	
	bigArray[2][0]=10;
	bigArray[2][1]=20;  //row 3
	bigArray[2][2]=30;
	bigArray[2][3]=40;
	
	//how to access
	System.out.println(bigArray[1][2]);
	
	
}
}
