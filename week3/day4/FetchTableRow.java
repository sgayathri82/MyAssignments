package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchTableRow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://erail.in/");
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.ENTER);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("cape",Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		
		
		
		
	}

}