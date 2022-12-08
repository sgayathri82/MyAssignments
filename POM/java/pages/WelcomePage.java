package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass{
	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
		
	}
		
	public MyHomePage clickCRMFSAButton() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new MyHomePage(driver);
		
	}
	
	public WelcomePage verifyHomePage() {
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		if(displayed=true) {
			System.out.println("My Home Page");
		}
		else
		{
			System.out.println("Click Failed");
		}
		return this;
	}

}
