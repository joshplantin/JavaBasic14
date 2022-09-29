package com.syntax.class10;

public class Array2Demo {
public static void main(String[]args) {
	String[][] countries= {
			{"USA","Canada"},
			{"Peru","Brazil","Colombia","Ecuador"},
			{"Ethiopia","Egypt","Kenya"},
			{"Germany","Turkey","Moldova","Ukraine"},
			{"Kazakhstan","Afghanistan","Korea"}
			
	};
	
	System.out.println(countries.length); //tells number or arrays (or rows)
	
	int elof1arr=countries[0].length;
	System.out.println(elof1arr);
	
	int elof2arr=countries[1].length;
	System.out.println(elof2arr);
	
	int elof3arr=countries[2].length;
	System.out.println(elof3arr);
	
	int elof4arr=countries[3].length;
	System.out.println(elof4arr);
	
	for (int r=0; r<countries.length; r++) {
		for(int c=0; c<countries[r].length; c++ ) {
			System.out.print(countries[r][c]);
			
		}
		System.out.println();
	}
	
	
	
}
}
