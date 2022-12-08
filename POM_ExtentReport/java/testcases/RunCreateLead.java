package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass{
	
	@BeforeTest
	public void setValues() {
		ExcelFileName="CreateLead";
		testName="CreateLeadTestcase-Leaftaps Application";
		testDescription="CreateLead functionality with valid multiple data";
		testCategory="Regression";
		testAuthor="Subraja";
		
	}
	
    @Test(dataProvider="fetch")
	public void runCreateLead(String username,String password,String companyName,String firstName,String lastName) throws InterruptedException, IOException {
    	LoginPage lp = new LoginPage(driver);
    	lp.enterUsername(username)
    	.enterPassword(password)
    	.clickLoginButton()
    	.clickCrmsfaLink()
    	.clickLeadsButton()
    	.clickCreateLeadButton()
    	.enterCompanyName(companyName)
    	.enterFirstName(firstName)
    	.enterLastName(lastName)
    	.clickSubmitButton()
    	.verifyCreateLead();
	
	}

}
