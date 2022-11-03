package week3;

import java.util.Scanner;

public class task4 {


	public static void main( String[] args) {
	Scanner reader = new Scanner (System.in);
	
	
	System.out.println("enter your name: ");
	String name = reader.next();
	
	StringBuilder sb = new StringBuilder(name);
	System.out.print(sb.reverse().toString());

	}
}
