package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class WelcomePage extends BaseClass {
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	

	public MyHomePage clickCrmsfaLink() throws IOException {
		try {
			driver.findElement(By.linkText("CRM/SFA")).click();
			reportStep("Crmsfa link is clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Crmsfa link is not  clicked successfully", "pass");
		}
		return new MyHomePage(driver);
	}

	public WelcomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;

	}

}
