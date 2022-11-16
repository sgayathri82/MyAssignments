package week4.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssignment2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input")).sendKeys("Frame Examples");
		
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		driver.switchTo().frame(frame2);
		
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		
		dropdown.click();
		
		Select sec= new Select(dropdown);
		
		List<WebElement> options = sec.getOptions();
		
		System.out.println("no of animals in select " + options.size());
		
		for (WebElement each : options) {
			
			Thread.sleep(2000);
			
			each.click();
			
			String text = each.getText();
			
			
	//		System.out.println(each.getText());
			
			System.out.println(text);
		}
		
				
		
	}

}
