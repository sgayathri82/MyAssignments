package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Chittorgarh {
	
	/*
	 * Chittorgarh:
	// 1. Launch the URL https://www.chittorgarh.com/
	//2. Click on stock market
	//3. Click on NSE bulk Deals
	//4. Get all the Security names
	//5. Ensure whether there are duplicate Security names
	 */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.chittorgarh.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		
		//To get thevalues from tr and from td3
		//table[@class='table table-bordered table-condensed table-striped']//tr[1]/td[3]
		
         //to get the row size
		List<WebElement> row = driver.findElements(By.xpath("//table//tr/td[3]"));
		int rowSize = row.size();
		System.out.println("The size of the Rows :"+rowSize);
		System.out.println("Security Name with Duplicates are:");
		
		//Adding the values to the list
		List<String> list = new ArrayList<String>();
		
		for(WebElement each:row)
		{
						
		//	System.out.println(each.getText());
			
			String secText = each.getText();
			
			list.add(secText); // to create set
			
		}
		System.out.println(list);
		
		//Adding the list values to set to remove the duplicates
		
		Set<String> Set = new LinkedHashSet<String>(list);
		
		System.out.println("The Security Name after removing duplicates "+Set.size());
		
		System.out.println(Set);
				
		driver.close();
		
		}
				
	}