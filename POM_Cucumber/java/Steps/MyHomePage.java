package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class MyHomePage extends BaseClass{

	
	@And("Click Leads Tab")
	public MyLeadsPage clickLeadsButton() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();	
		}



}
