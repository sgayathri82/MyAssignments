package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLogin extends BaseClass{
	
	@BeforeTest
	public void sendExcelName() {
		
		ExcelFileName="Login";
	}
	
	
	@Test(dataProvider= "fetch")
	public void runLogin(String username, String password) throws InterruptedException {
		
		System.out.println(driver);
		LoginPage lp = new LoginPage(driver);
        lp.enterUsername(username)
        .enterPassword(password)
        .clickLoginButton()
        .verifyHomePage();
        
        	
	}

}