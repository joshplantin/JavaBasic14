package com.syntax.class06;
import java.util.Scanner;
public class HW1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your country");
	String country=scan.nextLine();
	String language=null;
	

	switch(country) {
	
	case "America":
		language="English";
		break;
	case "Venezula":
		language="Spanish";
		break;
	case "China":
		language="Mandarin";
		break;
	case "Poland":
		language="Polish";
		break;
		default:
			language="Please enter a different country";
			break;
		}
	System.out.println("You are from "+country+" and the language you speak is "+language);
	

}
}
