package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://testleaf.herokuapp.com/pages/Alert.html");
		
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		//Thread.sleep(2000);
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		String text = alert.getText();
			
		System.out.println(text);
		
		//Thread.sleep(2000);
		
		alert.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		String text1 = alert.getText();
		
		System.out.println(text1);
		 
		Thread.sleep(2000);
		
		alert.sendKeys("Amirtha Institute");
		
		//Thread.sleep(2000);
		
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		
		String text2 = alert.getText();
		
		System.out.println(text2);
		
		//Thread.sleep(2000);
				
		alert.accept();
		
		String text3 = driver.findElement(By.xpath("//p[@id='result1']")).getText();
		
		System.out.println(text3);
		
		if(text3.contains("Amirtha"))
			
		{  System.out.println("text entered succesfully");
		
		}
		
		driver.close();
				

	}

}
