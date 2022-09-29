package com.syntax.class04;
import java.util.Scanner;
public class InputFromKeyboard3 {
public static void main(String[]args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter your name");
	String name=scanner.nextLine();
	System.out.println("Please enter your age");
	int age=scanner.nextInt();
	System.out.println("Please enter your address");
	String address=scanner.nextLine();
	System.out.println("Thank you "+name+". Your age is "+age+" and your address is "+address);
	
	
}
}
