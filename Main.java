package week6_redo;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		
//		int list[]= {25,4,5,8,6,43,25,255,25};
//		System.out.println(smallest(list));
//		System.out.println(indexOfTheSmallest(list));
//		System.out.println(indexOfTheSmallestStartingFrom(list, 1));
//	
//		swap(list, 0, 1);
//		System.out.println(Arrays.toString(list));
//		
//
//
//	    int[] array = { -3, 2, 3, 4, 7, 8, 12 };
//	    Scanner reader = new Scanner(System.in);
//
//		System.out.print("Values of the array: " + Arrays.toString(array));
//
//		System.out.println();
//		System.out.print("Enter searched number: ");
//		String searchedValue = reader.nextLine();
//
//	    System.out.println();
//
//	    boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
//
//	    if (result) {
//	    	System.out.println("Value " + searchedValue + " is in the array");
//	    } else {
//	    	System.out.println("Value " + searchedValue + " is not in the array");
//	    }
//	    
//	    
//	    
//	    int[] array2 = { 1, 2, 3, 4, 5 };
//	    printElegantly(array2);   
		
//		NightSky nightSky = new NightSky(0.1, 40, 10);
//		nightSky.printLine();
//		nightSky.print();

		
		NightSky nightSky = new NightSky(0.1, 40, 10);
		nightSky.print();
		System.out.println("Number of stars in the last print: " + nightSky.starsInLastPrint());
		
		
	    
	}

	
	public static int smallest(int[] array) {
		int smallest=array[0];
		for(int i = 0; i<array.length; i++) {
			if (array[i]<smallest) {
				smallest = array[i];
			}
		}return(smallest);
	}
	
	public static int indexOfTheSmallest(int[] array) {
		  int smallest = array[0];
		  int index = 0;

		  for (int i = 1; i < array.length; i++) {
		    if (array[i] < smallest) {
		      smallest = array[i];
		      index = i;
		    }
		  }
		  return index;
		}
	
	
	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		  
		  int smallest = array[index];
		  int smallestIndex = index;

		  for (int i = index + 1; i < array.length; i++) {
		    if (array[i] < smallest) {
		      smallest = array[i];
		      smallestIndex = i;
		    }
		  }
		  return smallestIndex;
		}

	
	public static void swap(int[] array, int index1, int index2) {

		  if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length && index1 != index2) {
		    int temp = array[index1];
		    array[index1] = array[index2];
		    array[index2] = temp;
		  }
		}

	public static void printElegantly(int[] array) {
		  // Check if the array is empty
		  if (array == null || array.length == 0) {
		    return;
		  }

		  // Print the numbers in the array on the same row
		  for (int i = 0; i < array.length; i++) {
		    System.out.print(array[i]);
		    if (i < array.length - 1) {
		      System.out.print(", ");
		    }
		  }

		  // Print a newline at the end
		  System.out.println();
		}


}
