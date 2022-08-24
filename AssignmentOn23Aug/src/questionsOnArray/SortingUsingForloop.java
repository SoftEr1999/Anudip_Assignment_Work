package questionsOnArray;

import java.util.Scanner;

public class SortingUsingForloop {
	
	//This program is for sorting of an array elements using for loop

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);  // Creating scanner object for input
		
		//Taking elements of an array as input from the user
		
		System.out.println("Enter number of elements in an array:");  // Number of elements in an array
		int n = s.nextInt();
		
		int []a = new int[10];
		System.out.println("Enter elements of an array:"); //Taking elements of an array
		
		//Taking input using for loop
		for(int i=1;i<=n;i++)
		{
			a[i]= s.nextInt();
		}

		// Applying the logic for sorting an array in ascending order
		
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				if(a[j+1]<a[j])
				{
					int temp;
					temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		//End of logic
		
		//Printing array elements after sorting them
		System.out.println("Array after sorting:");
		for(int i=1;i<=n;i++)
		{
			System.out.print(a[i]+"\t");
		}

		

	}

}
