package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		
		String parent = driver.getWindowHandle();
		
		System.out.println(parent);
				
		
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
						
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(windowHandles);
		
		System.out.println(list.size());
		
		driver.switchTo().window(list.get(1));
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(2000);
		
		//	driver.close();

	}

}
