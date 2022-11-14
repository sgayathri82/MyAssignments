package week3.day4;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesUsingSet {
	/*
	 * int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// print the matching value
	 */

	public static void main(String[] args) {
		
		//Declared Array
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//Find the Length if the Array and print
		
		int lengthOfArray= arr.length;
		
		System.out.println("The length of the Array is: "+lengthOfArray);
		
		//Declare set and add the values by using the for loop
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		
		System.out.println("The Duplicated Values are:");
		
		for(int i=0;i<lengthOfArray;i++)
		{
	        /*Set by default removes the duplicate values
	         * Iterate through the arr list
	         * Items will be added then the addstatus will be true
	         * If has duplicate value that value will be not added
	         * so if addStatus is not added that means false
	         * then print those alone to get the Duplicate values to be printed.
			*/
			boolean addStatus = set.add(arr[i]);
	         //add Status not true then print that value
	         if(addStatus!=true)
	         {
	        	 System.out.println(arr[i]);
	         }
	 	}
		
	}

}