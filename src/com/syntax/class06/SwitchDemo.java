package com.syntax.class06;
import java.util.Scanner;
public class SwitchDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please tell me where you are from");
	String country=scan.nextLine();
	String favoritefood=null;
	switch(country) {
	case "America":
		favoritefood="Burgers";
		break;
	case "Venezuela":
		favoritefood="Arepa";
		break;
	case "India":
	favoritefood="Curry";
	break;
	case "China":
	favoritefood="Fried Rice";
	break;
	default:
		favoritefood="unknown";
		break;
		
	
	
	}
	
	System.out.println("You are from "+country+" and your favorite food is "+favoritefood);
}
}
