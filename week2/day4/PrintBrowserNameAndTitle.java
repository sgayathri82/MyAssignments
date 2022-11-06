package week2.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintBrowserNameAndTitle {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
				
		
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();

	
	driver.findElement(By.xpath("//a[contains(text(),CRM/SFA)]")).click();
	
	driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
	
	driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Gayathri");
	
	driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Thyagarajan");
	
	driver.findElement(By.name("submitButton")).click();
	
	
	
	File source = driver.getScreenshotAs(OutputType.FILE);
		
	File des=new File("./snap/contactscreen.png");
	
	FileUtils.copyFile(source, des);
	
	
	String pageTitle = driver.getTitle();
	
	System.out.println("PageTitle is "+pageTitle);
	
	 driver.close();
	
	
	
	
	
	}

}
