package Steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WelcomePage extends BaseClass{

	
	@Then("HomePage should be displayed")
	public WelcomePage verifyHomePage() {
		 boolean displayed = getDriver().findElement(By.linkText("CRM/SFA")).isDisplayed();
		 Assert.assertTrue(displayed);
		 System.out.println("HomePage is displayed");
		 return this;
	}
	
	@But("Errormessage should be displayed")
	public WelcomePage verifyErrorMessage() {
		boolean displayed = getDriver().findElement(By.id("errorDiv")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
		//System.out.println("Error message is displayed");

	}
	@Given("Click CRMSFA link")
	public MyHomePage clickCRMSFALink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}



}
