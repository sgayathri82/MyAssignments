package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node017mdpcqnd47yy1r9mjtw0ik8ka433234.node0");
		
				
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		String text4 = driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
		System.out.println(text4);
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//span[text()='Did you notice?']"),"Did you notice?"));
		
		String text = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
		System.out.println(text);
		
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		
		WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
		String text2 = until.getText();
		System.out.println(text2);
		
		Thread.sleep(4000);
		
		String text3 = driver.findElement(By.xpath("//span[text()='I am about to hide']")).getText();
		System.out.println(text3);
		
		Thread.sleep(4000);
				
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
						
		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"))));
		
		
	}

}
