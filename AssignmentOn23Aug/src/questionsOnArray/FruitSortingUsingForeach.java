package questionsOnArray;

import java.util.Arrays;

public class FruitSortingUsingForeach {

	public static void main(String[] args) {
		
		String[] fruits= {"Mango","Apple","Grapes","Banana","Cherry"}; // array initialization and declaration
		
		   Arrays.sort(fruits); //sorting of the string array
		   
		   //Printing the sorted string array using for each loop
		   for(String x: fruits) 
		     { 
			    System.out.println(x);//print fruits name
		     }

	}

}
