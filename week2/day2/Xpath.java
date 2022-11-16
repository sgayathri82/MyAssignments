package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// attrbased path
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr2");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		//partialattr path based
		
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		
		//partial txtbased xpath
		
		driver.findElement(By.xpath("//a[contains(text(),CRM/SFA)]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//collection/index based
		
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("TestLeaf");	
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gayathri");
		
		driver.findElement(By.xpath("//input[contains(@id,'_lastName')]")).sendKeys("Thyagarajan");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
	}

}
