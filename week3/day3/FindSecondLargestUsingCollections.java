package week3.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestUsingCollections {
	
	/*
	 Pseudo Code:
	 1) Arrange the array in ascending order
	 2) Pick the 2nd element from the last and print it
	 3) Data:  3,2,11,4,6,7
	 */
	/*
	 * 1. Declared Integer list and implemented using ArrayList
	 * 2. Add all the list values and Print all the values in the list
	 * 3. Using Collections.sort() --> Sort the list
	 * 4. To find second largest listValue.get(listValue.size()-2)
	 * 5. That will display the second largest value
	 */

	public static void main(String[] args) {
		//Declared List and implemented using ArrayList
		
		List<Integer> listValue = new ArrayList<Integer>(Arrays.asList(3,2,11,14,6,7));
		
 			
		System.out.println("Printing all values in List:"+listValue);
		
		//Sorting the list using Collections.sort
		
		Collections.sort(listValue);
		
		//Printing the Sorted Values	
		
		System.out.println("After Sorting Values are:"+listValue);
		
		//Finding the SecondLargest
		
		Integer secondLargest = listValue.get(listValue.size()-2);
		System.out.println("The Second Largest value is "+secondLargest);

				
		
		

	}

}