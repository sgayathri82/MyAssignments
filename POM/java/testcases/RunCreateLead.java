package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass{
	
	@BeforeTest
	public void sendExcelName() {
		
		ExcelFileName="CreateLead";
	}
	
    @Test(dataProvider= "fetch")
	public void runCreateLead(String username,String password,String companyname,String firstname,String lastname) throws InterruptedException {
    	LoginPage lp = new LoginPage(driver);
    	lp.enterUsername(username)
    	.enterPassword(password)
    	.clickLoginButton()
    	.clickCRMFSAButton()
    	.clickLeadsButton()
    	.clickCreateLeadButton()
    	.enterCompanyName(companyname)
    	.enterFirstName(firstname)
    	.enterLastName(lastname)
    	.clickSubmitButton()
    	.verifyCreateLead();
    	
	
	}

}
