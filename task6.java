package week2;

import java.util.Scanner;

public class task6 {
	public static void main( String[] args) {
        Scanner reader = new Scanner(System.in); 

        System.out.println("How many times should the text be printed: ");

        int amount = reader.nextInt();
        printText(amount);
    }

public static void printText(int amount) {
    for(int i = 0; i < amount; i++) {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
        
    }

}


