package week2;

import java.util.Scanner;

public class task2 {
	public static void main( String[] args) {
        Scanner reader = new Scanner(System.in); 

        int sum = 0;
        int read; 

        System.out.println("Input first number: ");
        read = Integer.parseInt(reader.nextLine());

        System.out.println("Input second number: ");
        read += Integer.parseInt(reader.nextLine());

        System.out.println("Input third number: ");
        read += Integer.parseInt(reader.nextLine());

        System.out.println("The sum is: " + read);	
	}
}

