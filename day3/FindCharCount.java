package week1.day3;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="cognizant";
		char ch='c';
		int count=0;
		char[] array=str.toCharArray() ;
		int len=array.length;
		
		for ( int i=0;i<len;i++) {
			
			if(array[i]==ch) {
				count++;
				
			}
		}
		System.out.println("Given String is " +str);
		System.out.println("length of the array " +len);
		System.out.println("character to search " +ch);
  System.out.println(ch+ " is present in the array "+count+ " times");
	}

}
