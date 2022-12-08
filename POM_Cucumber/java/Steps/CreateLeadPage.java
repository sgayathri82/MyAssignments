package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass {
	
	@When("Enter the company name as (.*)$")
	public CreateLeadPage enterCompanyName(String companyName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}

	@And("Enter the first name as (.*)$")
	public CreateLeadPage enterFirstName(String firstname) {

		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
	}

	@And("Enter the last name as (.*)$")
	public CreateLeadPage enterLastName(String lastname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;
	}

	@And("Click on Create Lead Button")
	public ViewLeadPage clickCreateLeadButton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

	
	

}
