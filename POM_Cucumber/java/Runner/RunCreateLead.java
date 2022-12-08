package Runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Steps.BaseClass;
import Steps.LoginPage;



public class RunCreateLead extends BaseClass{
	
	@BeforeTest
	public void sendexcelName() {
		ExcelFileName="CreateLead";
	}
	
    @Test(dataProvider="fetch")
	public void runCreateLead(String username,String password,String companyName,String firstName,String lastName) throws InterruptedException {
    	LoginPage lp = new LoginPage();
    	lp.enterUsername(username)
    	.enterPassword(password)
    	.clickloginbutton()
    	.clickCRMSFALink()
    	.clickLeadsButton()
    	.clickCreateLead()
    	.enterCompanyName(companyName)
    	.enterFirstName(firstName)
    	.enterLastName(lastName)
    	.clickCreateLeadButton()
    	.verifyViewLeadsPage();
	
	}

}
