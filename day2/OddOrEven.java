package week1.day2;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 25; int reminder = a%2;
		
		System.out.println("The Given Number is " +a);
		if(a%2==0) {
			
			System.out.println("even");
		}
		
		else {
			System.out.println(a+ " is odd");
		}
		System.out.println("Reminder is " +reminder);
	}

}
