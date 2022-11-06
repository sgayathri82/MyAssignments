package weekend2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt1 ="stops";
		
		String txt2 ="potss";
		
		int count=0;
		
		char[] array1=txt1.toCharArray() ;
		char[] array2=txt2.toCharArray() ;
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		int len1=array1.length;
		int len2=array2.length;
		
		System.out.println("String1 " +txt1);
		System.out.println("String2 " +txt2);
		
		if(len1==len2)
			
		{
			
			System.out.println("Length of both strings are same");
		
		
		for(int i=0; i<len1;i++) 
		{
				if(array1[i]!=array2[i])
				{			
					
					System.out.println("The string is not an Anagram"); 
					
					break;	
				}	
				
				else
					count++;
		}
		}
		
		else
			System.out.println("The string is not an Anagram");
	
		
		if(count==len1)
		{
			
			System.out.println("The string is an Anagram");
		}
	}

}
