package questionsOnArray;

public class PresenseOfElement {

	public static void main(String[] args) {
		
		//This program finds that element 100 is present in an array or not
		
		
		int array[]= {75,4,56,5,36,100,77,18,29,94}; //initialization and declaration of array.
		
		//Starting a for loop
		
	    for(int i=0;i<array.length;i++)
	    {
	    	if(array[i]==100) //condition for checking 100 is available or not 
	    	{
	    		System.out.print("Index of 100 is "+i); //print the index/position of element 100 
	    	}
	    }

	}

}
