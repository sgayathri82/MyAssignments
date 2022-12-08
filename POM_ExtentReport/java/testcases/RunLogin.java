package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLogin extends BaseClass{
	
	@BeforeTest
	public void setValues() {
		ExcelFileName="Login";
		testName="Login-Leaftaps";
		testDescription="Login functionality with valid credential";
		testCategory="Smoke";
		testAuthor="Subraja";
		
	}
	
	@Test(dataProvider="fetch")
	public void runLogin(String username,String password) throws InterruptedException, IOException {
		System.out.println(driver);
		LoginPage lp = new LoginPage(driver);
        lp.enterUsername(username)
        .enterPassword(password)
        .clickLoginButton()
        .verifyHomePage();
        
        
		
	}

}
