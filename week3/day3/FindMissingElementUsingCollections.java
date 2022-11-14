package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingCollections {

	/*
	 * 1. Declare Integer Array List
	 * 2. Implement the ArrayList
	 * 3. Add values to the list using Collections.addAll()
	 * 4. Sort the Collections using Collections.sort()
	 * 5. Declare int as Count =1
	 * 6. Initialize For each loop
	 * 7. Iterate Count
	 * 8. Chk the list values and count are equal
	 * 9. If not equal then print the missing value
	 * 10. Increment the Count
	 * 
	 */
	public static void main(String[] args) {
		
		List<Integer> listValue = new ArrayList<Integer>();
		Collections.addAll(listValue, 1,2,3,4,7,8,6);
		int count=1;
		System.out.println("List Values are :"+listValue);
		//Sorting the Array
		Collections.sort(listValue);
		//After Sorting
		System.out.println("After Sorting:"+listValue);
		//To find the missing element in an ArrayList 
		
		for(Integer findmissingVal : listValue)
		{
			if(findmissingVal!=count)
			{
				System.out.println("The Missing Value is :"+count);
				count++;
			}
			count++;
		}
		
		
		

	}

}