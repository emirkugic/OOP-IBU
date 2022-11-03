package week3;

import java.util.Scanner;

public class task8 {


	public static void main( String[] args) {
		
		Scanner reader = new Scanner (System.in);

        System.out.println("Type a text: ");
        String word = reader.nextLine();

        palindrome(word);
    }

    public static void palindrome(String word) {
        String reverse = ""; 
        
        for(int i = (word.length() - 1); i >= 0; i--) {
            reverse += word.charAt(i); 
        }

        if(word.equals(reverse)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
