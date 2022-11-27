package assignments.copy;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {


//		1. Launch https://www.snapdeal.com/
//		2. Go to Mens Fashion
//		3. Go to Sports Shoes
//		4. Get the count of the sports shoes
//		5. Click Training shoes
//		6. Sort by Low to High
//		7. Check if the items displayed are sorted correctly
//		8. Select the price range (900-1200)
//		9. Filter with color yellow 
//		10. verify the all applied filters 
//		11. Mouse Hover on first resulting Training shoes
//		12. click QuickView button
//		13. Print the cost and the discount percentage
//		14. Take the snapshot of the shoes.
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions builder = new Actions(driver);
		WebElement mensFashion = driver.findElement(By.xpath("//span[@class='catText']"));
		builder.moveToElement(mensFashion).perform();	
		Thread.sleep(2000);
		
//		3. Go to Sports Shoes
		driver.findElement(By.xpath("//span[contains(text(),'Sports Shoes')]")).click();
		Thread.sleep(2000);

//		4. Get the count of the sports shoes
		List<WebElement> sportsShoe = driver.findElements(By.xpath("//p[@class='product-title']"));
		int sportsShoeCount = sportsShoe.size();
		System.out.println("Sports Shoe count is: "+sportsShoeCount);
		
//		5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(2000);
		
//		6. Sort by Low to High
		WebElement dropdown = driver.findElement(By.xpath("//span[text()='Sort by:']"));
		dropdown.click();
		
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		
	//	Select sel=new Select(dropdown);
	//	List<WebElement> options1 = sort.getOptions();
	//	sel.selectByValue("Price Low To High");
		
//		7. Check if the items displayed are sorted correctly
		Thread.sleep(2000);
		List<WebElement> trainingShoePrice = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		int numOfTrainingShoe = trainingShoePrice.size();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<numOfTrainingShoe;i++)
		{
			String replace1 = trainingShoePrice.get(i).getText().replace("Rs. ", "").replaceAll(",","");
			System.out.println(replace1);
			int parseInt = Integer.parseInt(replace1);
			list.add(parseInt);
		}
	//	Collections.sort(list);
		System.out.println("Price list low to high: "+list);

		//7. Check if the items displayed are sorted correctly
		
		boolean sorted = false;
		for(int i=0;i<list.size()-1;i++)
		{
			if(list.get(i)<=list.get(i+1))
				sorted = true;
			else
			{
				sorted = false;
				break;
			}
		}
		if(sorted)
			System.out.println("Price is Sorted");
		else
			System.out.println("Price is not sorted");
		
		//8.Select the price range (900-1200)
//		
//				System.out.println("Price between 900 and 1200 are: ");
//				for(int i=0;i<list.size()-1;i++)
//				{
//					if((list.get(i)>=900)&&(list.get(i)<=1200))
//						System.out.println(list.get(i));
//					else
//						continue;
//				}
//				
		Thread.sleep(2000);
		WebElement minrange = driver.findElement(By.xpath("//input[@name='fromVal']"));
		minrange.clear();
		minrange.sendKeys("900");
		
		Thread.sleep(2000);
		WebElement maxrange = driver.findElement(By.xpath("//input[@name='toVal']"));
		maxrange.clear();
		maxrange.sendKeys("1200");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
//		9.Filter with color yellow
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();
		
		//10 verify the all applied filters 
		
		Thread.sleep(7000);
		String verifyColor = driver.findElement(By.xpath("//a[text()='Yellow']")).getText();
		System.out.println("Your filtered color is: "+verifyColor);

				
				
//		//11. Mouse Hover on first resulting Training shoes
//		WebElement trainingShoe = driver.findElement(By.xpath("//img[contains(@class,'product-image ')]"));
		Thread.sleep(2000);
		WebElement trainingshoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		builder.moveToElement(trainingshoe).perform();

//
//		12. click QuickView button
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Quick')]")).click();
		
//		13. Print the cost and the discount percentage 
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Price of the selected show is: "+price);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount is: "+discount);
         
//			14. Take the snapshot of the shoes.	
        File source = driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./snaps/firstYellowShoe.png");
        FileUtils.copyFile(source, dest);
		

		
	//	driver.close();
		
		
				
	}

}
