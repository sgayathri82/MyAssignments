package weekend2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Madam";
		String rev="";
		
		char ch;
		
		System.out.println("The Given string is " +s1);
		int len=s1.length();
		
		for(int i=0;i<len;i++)
		{
			ch=s1.charAt(i);
			rev=ch+rev;
			
		}
		System.out.println("The Reversed string is " +rev);
		
		boolean comparestring = s1.equalsIgnoreCase(rev);
		
		System.out.println(comparestring);
		
		if(comparestring==true)
		{
			System.out.println(s1+ " is a palindrome");
		}
		else
			System.out.println(s1+ " is not a palindrome");

	}

}
