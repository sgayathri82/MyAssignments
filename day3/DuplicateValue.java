package week1.day3;

import java.util.Arrays;

public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {12,25,12,56,89,25,78,25,56,33,99,88,88,88};
		
		int length= nums.length;
		
		Arrays.sort(nums);
				
		System.out.println("length of the array " +length);
		
		
//		int find = 12;
//		int count =0;
		
		for(int i=0;i<length-1; i++) {
			
//			if(nums[i] == find) {
				
//				count++;
//			}
			
			if(nums[i+1]==nums[i]) {
				
				System.out.println("Duplicated number in the array " +nums[i]);
				
				 i++;
				
			}
			
			}
		
		
//		
//		System.out.println("Duplicated number in the array " +nums[0]);
		
//		System.out.println("number of times of duplication  "  +count);
		
//		System.out.println(nums[0]);
		 

	}

}
