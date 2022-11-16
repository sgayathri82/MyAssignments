package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintPhonePrice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		List<WebElement> phoneprice = driver.findElements(By.className("a-price-whole"));
		
		System.out.println(phoneprice.size());
				
		for (WebElement each : phoneprice) {
			
			String price=each.getText();
			System.out.println(price);
			
		}
		
		
		
	}

}