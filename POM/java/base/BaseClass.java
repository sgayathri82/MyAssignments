package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadData;


public class BaseClass {
	
	public ChromeDriver driver;
	public String ExcelFileName;
	
@BeforeMethod	
	
	public void precondition() {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

@AfterMethod
	
	public void postcondition() {
		
	//	driver.close();
		
	}

@DataProvider(name= "fetch")
	public String[][] sendData() throws IOException {
	
	String[][] readData = ReadData.readData(ExcelFileName);
	return readData;
	
	}
}
