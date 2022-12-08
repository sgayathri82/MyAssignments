package Runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Steps.BaseClass;
import Steps.LoginPage;

public class RunLogin extends Steps.BaseClass{
	
	@BeforeTest
	public void sendexcelName() {
		ExcelFileName="Login";
	}
	
	@Test(dataProvider="fetch")
	public void runLogin(String username,String password) throws InterruptedException {
		
		LoginPage lp = new LoginPage();
        lp.enterUsername(username)
        .enterPassword(password)
        .clickloginbutton()
        .verifyHomePage();
        
        
		
	}

}
