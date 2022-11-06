package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// attrbased path
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr2");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
				
		//partialattr path based
				
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
				
		//partial txtbased xpath
				
		driver.findElement(By.xpath("//a[contains(text(),CRM/SFA)]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();	
		
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[2]/a")).click();
				
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate')]")).click();

		
		String dupName = driver.findElement(By.xpath("//div[contains(text(),'Duplicate')]")).getText();
		
		System.out.println("The String Name displayed in Page is :"+dupName);
		
		String textName ="Duplicate Lead";
		
		if(textName.equals(dupName))
			{
			System.out.println("Duplicate Lead Name Displayed successfully");
		}
		else
		{
			System.out.println("Duplicate Lead Name not matched");
		}
		
		//Click Create Lead
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Capture the Duplicated Lead Name
		
		String  firstNameText = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		String  compareText ="Hema";
		
		if(firstNameText.equals(compareText))
		{
			System.out.println("File Name Matched");
		}
		else
		{
			System.out.println("File Name not matching");
		}
		driver.close();
		
	}

}
