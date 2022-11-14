package week3.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingCollections {

	public static void main(String[] args) {
		
		/* Declaring List of Array list1,list2 and list3 and implement using Array List
		 * Adding the values to list using Arrays.asList() method
		 * Print the Added values to list1 and list2
		 * Initialized for loop 
		 * Going thru all values in list1 and list2
		 * Check if list1.get(i) values = list2.get(i)
		 * If values are equal then store in list3
		 * else  iterate next i and j values
		 * print the common values in list1 and list2
		 * by printing the list3.
		 * 
		*/
		List<String> list1 = new ArrayList<String>(Arrays.asList("3","2","11","4","6","7"));
		List<String> list2 = new ArrayList<String>(Arrays.asList("1","2","8","4","9","7"));
		List<String> list3 = new ArrayList<String>();
		
		System.out.println("List1 Values are : "+list1);
		System.out.println("List2 Values are : "+list2);
		
		//Using for loop 
		
		for(int i=0;i< list1.size();i++)
		{
			for(int j =0;j<list2.size();j++)
			{
			   //If list1 values are equal to list2 then add those values to list3
				if(list1.get(i)==list2.get(j))
				{
					list3.add(list1.get(i));
					
				}
				
			}
			
		}
		//Print the list3 values which has intersection values
		System.out.println("Intersection of List1 and List2 are"+list3);
 
	}

}