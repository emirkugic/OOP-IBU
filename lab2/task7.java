package week2;

import java.util.Scanner;


public class task7 {
	public static void main( String[] args) {
        Scanner reader = new Scanner(System.in); 

        printStars(5);
        printStars(3);
        printStars(9);
    }

	private static void printStars(int amount) {
        int i = 1; 
        while(i <= amount) {
            System.out.print("*");
            i++;
        }
        System.out.println(" ");
    }  
}



