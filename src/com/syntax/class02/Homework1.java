package com.syntax.class02;

public class Homework1 {
public static void main(String[]args) {
	
	double num1, num2;
	
	num1=10.5;
	num2=20.5;
	
	double sum=num1+num2;
	double sub=num1-num2;
	double multi=num1*num2;
	double div=num1/num2;
	
	
	System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
	System.out.println("The subtraction of "+num1+" and "+num2+" is "+sub);
	System.out.println("The multiplication of "+num1+" and "+num2+" is "+multi);
	System.out.println("The division of "+num1+" and "+num2+" is "+div);
	
	double num3=3.9;
	double square=num3*num3;
	
	System.out.println("The square of "+num3+" is "+square);
	
	int height, width;
	
	height=8;
	width=5;
	
	int area=height*width;
	int perimeter=(height*2)+(width*2);
	
	System.out.println("The area of a rectangle with a height of "+height+" and a width of "+width+" is equal to "+area);
	System.out.print("The perimeter of a rectangle with a width of "+width+" and a height of "+height+" is equal to "+perimeter);
	
}
}
