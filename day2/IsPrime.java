package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=7129;
		int count = 0;
		
		System.out.println("Given Number is " +num);
		
		for(int i=2; i<num;i++) {
			
			if(num%i==0) {
				
				count++;
			}
		}
		
		if(count==0) {
			
			System.out.println("Given Number is a Prime");
			
		}
		else 
			System.out.println("Given Number is Not a Prime");
		
		System.out.println(" ");
		
		
		int num1=9854;
		int count1 = 0;
		
		System.out.println("Given Number is " +num1);
		
		for(int i=2; i<num1;i++) {
			
			if(num1%i==0) {
				
				count1++;
			}
		}
		
		if(count1==0) {
			
			System.out.println("Given Number is a Prime");
			
		}
		else 
			System.out.println("Given Number is Not a Prime");
		
		


	}

}
