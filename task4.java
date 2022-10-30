package week2;

import java.util.Scanner;

public class task4 {
	public static void main( String[] args) {
        Scanner reader = new Scanner(System.in); 

        System.out.println("First: "); 
        int first = reader.nextInt();

        System.out.println("Last: "); 
        int last = reader.nextInt();

        while(first <= last) {
            if(first > last) {
                break;
            }
            System.out.println(first);
            first++;
        }

    }
}

