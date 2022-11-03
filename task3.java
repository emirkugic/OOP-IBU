package week3;

import java.util.Scanner;

public class task3 {


	public static void main( String[] args) {
	Scanner reader = new Scanner (System.in);
	
	int counter = 1;
	
	System.out.println("enter your name: ");
	String name = reader.next();
	int len = name.length();
	for(int i=0; i<len; i++, counter++) {
		System.out.println(counter+". character  "+name.charAt(i));
		}	
	}
}
