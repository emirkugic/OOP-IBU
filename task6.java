package week3;

import java.util.*;

public class task6 {


	public static void main( String[] args) {
	Scanner reader = new Scanner (System.in);
	
    ArrayList<String> words = new ArrayList<String>();

    while(true){
        System.out.print("Enter a word: "); 
        String word = reader.nextLine();
        if(words.contains(word)) {
            System.out.println("You gave the word " + word + " twice");
            break;
        }
        words.add(word); 
    }

    Collections.sort(words);

    for(String i : words) {
        System.out.println(i);
    }
}
}
