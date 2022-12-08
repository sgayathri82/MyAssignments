package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass{

	
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String username) {
		getDriver().findElement(By.id("username")).sendKeys(username);
		return this;

	}
	@Given("Enter the password as {string}")
	public LoginPage enterPassword(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this;
	}
	@When("Click on  Login button")
	public WelcomePage clickloginbutton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		 return new WelcomePage();
	}
	
	



}
