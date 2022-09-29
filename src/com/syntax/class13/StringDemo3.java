package com.syntax.class13;

public class StringDemo3 {
public static void main(String[] args) {
	String str="asldkfjasdlfkjasdf#)(@*#$)#%";
	System.out.println(str.replaceAll("[0-9]", "a"));
	System.out.println(str.replaceAll("[0-9]", ""));
	 //removes all characters besides special
	System.out.println(str.replaceAll("[0-z]", ""));
	System.out.println(str.replaceAll("[^A-Z]", ""));// ^ means not
			
}
}
