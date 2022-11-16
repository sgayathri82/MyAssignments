package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		//Thread.sleep(3000);
				
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		String text2 = alert.getText();
		
		System.out.println(text2);
		
		alert.sendKeys("Gayathri");
		
		// Thread.sleep(2000);
		
		alert.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		System.out.println(text);
		
		if(text.contains("Gayathri"))
		
		{
			System.out.println("Text entered correctly");
		}
		
		else {
			
			System.out.println("wrong Text entered");
		}
			
	}

}
