package week2;

import java.util.Scanner;

public class task1 {
	public static void main( String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "password"; 

        while(true) {
            System.out.println("Type the password: ");
            String guess = reader.nextLine();

            if(guess.equals(password)) {
                System.out.println("Right!");
                break;
            }
        }
        System.out.println("The secret is: 2+2=5");
			
	}
}

