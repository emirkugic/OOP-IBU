package learning_java;

import java.util.Scanner;

public class task6 {
	
	public static void main(String[] args)  {

		int number1, number2, largest;
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Type the first number: ");
		number1 = reader.nextInt();	
		
		System.out.print("Type the second number: ");
		number2 = reader.nextInt();	
		
		if(number1 == number2) 
	    {
			System.out.println("\nBoth are Equal");     
	    }
		else
		{
			largest = (number1 > number2)? number1: number2;
			System.out.println("\nGreater number: " + largest);   
		}
	}	
}

