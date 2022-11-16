package day1;

public class Car {

		public void driveCar() {

			System.out.println("Drive the Car on Green Light ");
		}
		
		public void applyBrake() {

			System.out.println("Apply Brake on Yellow Light ");
		}
		
		public void soundHorn() {

			System.out.println("Sound Horn during Traffic ");
		}

		public void isPuncture() {

			System.out.println("Change the Punctured Tyre ");
		}
		
		public String isPuncture1() {
			return "isPuncture" ;
		}
		
		public static void main(String[] args) {
			Car obj = new Car();
			obj.driveCar();
			obj.applyBrake();
			obj.soundHorn();
			obj.isPuncture();
			String puncture = obj.isPuncture1();
			System.out.println(puncture);
			
			
		}
	
}
