package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class MyLeadsPage extends BaseClass{

	
	@And("Click Create Lead Link")
	public CreateLeadPage clickCreateLead() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}




}
