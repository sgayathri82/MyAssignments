package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		
		
		Automation obj = new Automation();
		
		obj.Selenium();
		obj.java();
		
		obj.ruby();
		obj.python();

	}

	public void Selenium() {
		System.out.println("Method-Selenium from Interface TestTool");
		System.out.println(" ");
		
	}

	public void java() {
		System.out.println("Method -java from Interface Language");
		System.out.println(" ");
		
	}

	@Override
	public void ruby() {
		System.out.println("Unimplemented Method - ruby from Abstract Class MultipleLanguage");
		System.out.println(" ");
	}

}
