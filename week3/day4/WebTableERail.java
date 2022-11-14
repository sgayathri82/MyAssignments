package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableERail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://erail.in/");
		//Enter MS and Enter
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MS",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();	
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("cape",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		//To get the no of columns 
		//As we are going to get the value of 2nd col only ..so col size not required to use
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//th"));
		int colSize = columns.size();
		System.out.println("The Columnsize of the table is :"+colSize);
		
		//To get the Row size
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		int rowSize = rows.size();
		System.out.println("The Rowsize of the table is :"+rowSize);
		
		//To get the all Train names and print the Train names
		System.out.println("The Train Names are");
		//To get the values of 2nd column values alone
		//Single for loop enough to the 2nd col values alone since td[2] is always 2
		for(int i =2;i<=rowSize;i++)
		{
		    //We cannot directly print the Webelements train names
			//We are getting into List and using for each loop we are getting the train names
	
			List<WebElement> trainNamesList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]//td[2]"));
			 for(WebElement each: trainNamesList)
			 {
				  String trainNames = each.getText();
				  System.out.println(trainNames);
			 }
			
		}
		
	}

}