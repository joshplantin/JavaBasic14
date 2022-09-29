package com.syntax.class01;

public class VariableValues {
public static void main(String[]args) {
	byte value1=5;
	short value2=138;
	int value3=1000;
	long value4=10000000000l;
	double value5=9.99;
	float value6=9.999f;
	char value7='J';
	boolean value8=true;
	
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
	System.out.println(value4);
	System.out.println(value5);
	System.out.println(value6);
	System.out.println(value7);
	System.out.println(value8);

	value1=10;
	value2=139;
	value3=2000;
	value4=100000000000000l;  //reassigned values
	value5=10.99;
	value6=10.999999f;
	value7='D';
	value8=false;
	
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
	System.out.println(value4);
	System.out.println(value5);
	System.out.println(value6);
	System.out.println(value7);
	System.out.println(value8);

}
}
