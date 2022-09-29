package com.syntax.class03;

public class Casting {
public static void main(String[]args) {

byte box1=127;
short box2=3333;
int box3=45454545;
long box4=45454545;
float box5=414564545;
double box6=454545445;


int number=(int)15.2; //we cant store the decimal number in a box of type int
System.out.println(number);

byte smallerBox=(byte)box2;
System.out.print(smallerBox);

short biggerBox=box1;

char x=(char)15;
System.out.println(x);


}
}
