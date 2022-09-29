package com.syntax.class02;

public class ArithmeticOperator {
public static void main(String[]args) {
	
	int a=5;
	int b=10;
	
	System.out.println(a+b);
	
	int c=10;
	int d=3;
	
	int sum=c+d;
	int sub=c-d;
	int remainder=c%d;
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(remainder);
	
	int e=10;
	int f=5;
	
	System.out.println("division = "+e/f);
	System.out.println("remainder = "+remainder);
	
	double num1=10.0;
	double num2=3.0;
	
	System.out.println("Division of double = "+num1/num2);
	System.out.println(num1%num2);
	
	float number1=10.0f;
	float number2=3.0f;
	System.out.println("Division of float ="+number1/number2);
	System.out.println(number1%number2);
	
	System.out.println("Remainder examples");
	//remainder - % - mod operator
	System.out.println(16%4);
	
}
}
