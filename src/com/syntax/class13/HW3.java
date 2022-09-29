package com.syntax.class13;
import java.util.Scanner;
public class HW3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the name of the mother");
	String mother=scan.nextLine();
	System.out.println("Please enter the name of the father");
	String father=scan.nextLine();
	
	
	
String motherName="Mary";
String fatherName="Daniel";
boolean isBoy=true;

if(isBoy) {
	String firstHalf=fatherName.substring(0,fatherName.length()/2);//0-takes first half
	String secondHalf=motherName.substring(motherName.length()/2);//takes second half
	System.out.println(firstHalf+secondHalf);
}
else {
	String firstHalf=motherName.substring(0,motherName.length()/2);
	String secondHalf=fatherName.substring(motherName.length()/2);
	System.out.println(firstHalf+secondHalf);
}

}
}