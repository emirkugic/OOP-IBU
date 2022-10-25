package learning_java;

import java.util.Scanner;

public class task4 {
	
	public static void main(String[] args)  {

	    Scanner reader = new Scanner (System.in);
	    System.out.print("Type a number: ");
	    int num1 = reader.nextInt();
	    System.out.print("Type another number: ");
	    int num2 = reader.nextInt();
	    int sum = num1 + num2;
	    System.out.println();
	    System.err.println("Sum of the numbers: "+sum);
	}
}
