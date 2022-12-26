package week6;
public class BinarySearch {
	  public static boolean search(int[] array, int searchedValue) {
	    // Check if the array is empty
	    if (array == null || array.length == 0) {
	      return false;
	    }

	    // Perform binary search
	    int left = 0;
	    int right = array.length - 1;

	    while (left <= right) {
	      int mid = left + (right - left) / 2;

	      if (array[mid] == searchedValue) {
	        // The value has been found
	        return true;
	      } else if (array[mid] < searchedValue) {
	        // Search the right side of the array
	        left = mid + 1;
	      } else {
	        // Search the left side of the array
	        right = mid - 1;
	      }
	    }

	    // The value was not found in the array
	    return false;
	  }
	}
