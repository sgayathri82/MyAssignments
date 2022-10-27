package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum=0;
		int secNum=1;
		int fibo=0;
		
		System.out.println("Fibonacci Series for First 11 Numbers : ");
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for (int i=1; i<10;i++) {
			
			fibo=firstNum+secNum;
			
			firstNum=secNum;
			secNum=fibo;
			
			System.out.println(fibo);
		}
		
		
		
		
	}

}
