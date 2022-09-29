package com.syntax.class13;

import java.util.Arrays;

public class StringDemo {
public static void main(String[] args) {

String str="Today is sunday";	
String day=str.substring(9);
str="Today is sunday";
System.out.println(day);
System.out.println(str.substring(6,8));
char c=str.charAt(4); //calling the method and storing in char variable. String to char
System.out.println();

char[] charArr=str.toCharArray();
System.out.println(Arrays.toString(charArr));//prints as string in array form 
System.out.println(charArr);//prints straight as if not in an array

int index=str.indexOf("a");
System.out.println(index);
System.out.println(str.indexOf("a",6));

}
}
