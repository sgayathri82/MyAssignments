package Steps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadData;

public class BaseClass extends AbstractTestNGCucumberTests {
      //public  ChromeDriver driver;
   private static final ThreadLocal<RemoteWebDriver> remoteWebDriver= new ThreadLocal<RemoteWebDriver>();
   public String ExcelFileName;

   
   //setter method
   public void setDriver() {
	   remoteWebDriver.set(new ChromeDriver());

}
   //getter method
   public RemoteWebDriver getDriver() {
	 return remoteWebDriver.get();

}
	
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		setDriver();
		//driver = new ChromeDriver();//driver is initialized
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().get("http://leaftaps.com/opentaps/control/main");
	}
	@DataProvider(name = "fetch")
	public String[][] sendData() throws IOException {
		return ReadData.readData(ExcelFileName);

	}
	
	@AfterMethod
	public void postCondition() {
       //driver.close();
	}

}
