package week2.day4;

public class KeyBoard extends Desktop {
	
	public void keys() {
		
		System.out.println("keys");
		
	}
	
	public static void main(String[] args) {
		
		KeyBoard obj1=new KeyBoard();
		 obj1.computerModel(); 
		 obj1.desktopSize();
		 obj1.keys();
	}
}

