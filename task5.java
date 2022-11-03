package week3;

import java.util.Scanner;

public class task5 {


	public static void main( String[] args) {
	Scanner reader = new Scanner (System.in);
	
	
	System.out.println("first string: ");
	String str1 = reader.nextLine();
	
	System.out.println("second string: ");
	String str2 = reader.nextLine();
	
	
	if(str1.contains(str2)) {
		System.out.println("The word " + str1 + " contains " + str2);
	}
	else {
		System.out.println("It doesnt contain");
	}

	}
}
