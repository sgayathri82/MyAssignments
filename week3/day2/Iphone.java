package week3.day2;

public class Iphone implements Mobile{

	public static void main(String[] args) {
		
		Iphone obj=new Iphone();
		obj.modelNumber();
		obj.sms();
		obj.voiceCall();
		
		
	}

	public void modelNumber() {
		System.out.println("Model Number");
	}

	public void sms() {
		System.out.println("SMS");
	}

	public void voiceCall() {
		System.out.println("Voice Calls");
	}
	

}
