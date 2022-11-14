package week3.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	/*
	 * Pseudo code 
	 
	 * Declare the String
	 * Split the String using Split()
	 * Store the values in String[]
	 * Declare Set
	 * To get in insertion order used LinkedHashSet
	 * using For each added the splitted value to the set
	 * print the set
	 * Set displayed without duplicate values
	 */
	public static void main(String[] args) {
		
		String text ="We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
				
	  // Using Set to remove the duplicates
		
		System.out.println("Removed Duplicates:");
		
		Set<String> set=new LinkedHashSet<String>();
		for (String each : split) {
			set.add(each);
		}
		System.out.println(set);
		
	
	}	
	}