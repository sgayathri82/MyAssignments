package classroom.activity;

public class SuperKeyword {
	

}
public class Parent {
	
	public void land1() {
		System.out.println("Parent class");

	}

}

public class Child extends Parent {
	
	public void land2() {
		super.land1();
		System.out.println("Child class");

	}
	
	public void land1() {
		super.land1();
		System.out.println("Overriden method in child class");

	}
	
public static void main(String[] args) {
	Child c = new Child();
	c.land2();
}
}
