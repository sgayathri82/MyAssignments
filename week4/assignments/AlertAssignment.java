package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(2000);
		
		alert.accept();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		
		System.out.println(alert.getText());
		
		Thread.sleep(2000);
		
		alert.dismiss();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'inspectable')]")).getText();
		
		System.out.println(text2);
	
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		
		String text = driver.findElement(By.xpath("//p[@class='m-0']")).getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		
		String text3 = alert.getText();
		
		System.out.println(text3);
		
		alert.sendKeys("Gayathri");
		
		Thread.sleep(2000);
		
		alert.accept();
		
		String text6 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		
		System.out.println(text6);
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
		
		Thread.sleep(2000);
		
		String text4 = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
		
		System.out.println(text4);
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[9]")).click();
		
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
		
		String text5 = driver.findElement(By.xpath("(//p[@class='m-0'])[2]")).getText();
		
		System.out.println(text5);		
		
		Thread.sleep(2000);
						
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
			
		
		driver.close();
	}

}
