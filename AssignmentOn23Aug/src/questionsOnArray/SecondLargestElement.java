package questionsOnArray;

import java.util.Arrays;

public class SecondLargestElement {
	
	// Program is to find the second largest elements in an array

	public static void main(String[] args) {
		
		int array[]= {75,4,56,5,36,100,77,18,29,94}; //initialization and declaration of array.
		
		//Sorting of an array using a sort() method of a class Arrays
		
		Arrays.sort(array); // method for sorting array elements in ascending order
		
		// printing the second largest element of an array
		System.out.print("The Second largest element in an array is: ");
		System.out.println(array[array.length-3]); // the index for second largest element after sorting
		
		
	}

}
