package week3;

import java.util.Scanner;

public class task2 {


	public static void main( String[] args) {
		
	Scanner reader = new Scanner (System.in);
	
	System.out.println("enter your name: ");
	String name = reader.next();
	int len = name.length();
	System.out.println("your name has "+len+" characters");
	
	}
}
