package week2.day4;

public class AxisBank extends BankInfo{
	
	// overriding concept
	
	public void deposit(float a) {
		
		System.out.println("The deposited amount in child class is" +a);
		
	}
	
	public static void main(String[] args) {
		
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit(2345);
		
	}

}
