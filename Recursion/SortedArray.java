package basic;

public class SortedArray {


	    public static boolean isSortedRecursive(int[] arr, int start, int end) {
	    	if(arr.length==0)
	    		return true;
	    	if(arr[0]<arr[1]) {
	        // Base case: Empty array or single-element array is always sorted
	    		 if (start >= end) {
	 	            return true;
	 	        }

	 	        // Check if the current element is greater than the next element
	 	        if (arr[start] > arr[start + 1]) {
	 	            return false;
	 	        }

	 	        // Recursively check the remaining m
	 	        return isSortedRecursive(arr, start + 1, end);
	    }
	    	else {
	    		 if (start >= end) {
	 	            return true;
	 	        }

	 	        // Check if the current element is greater than the next element
	 	        if (arr[start] < arr[start + 1]) {
	 	            return false;
	 	        }

	 	        // Recursively check the remaining m
	 	        return isSortedRecursive(arr, start + 1, end);
	    		
	    	}
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {5, 4, 0, 2, 1};
	        int[] arr3 = {};  // Empty array

	        System.out.println(isSortedRecursive(arr1, 0, arr1.length - 1));  // Output: true
	        System.out.println(isSortedRecursive(arr2, 0, arr2.length - 1));  // Output: false
	        System.out.println(isSortedRecursive(arr3, 0, arr3.length - 1));  // Output: true
	    }
	}

