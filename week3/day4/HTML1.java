package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {

	/*HTML1
	// 1. Launch the URL https://html.com/tags/table/
	//2. Get the count of number of rows
	//3. Get the count of number of columns
	 *  */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		
		//Table1 Name
		String tableName1 = driver.findElement(By.xpath("//caption")).getText();
		System.out.println("The Table Name1:"+tableName1);
		
		//To get Col count of table 1
		List<WebElement> noOfCols1 = driver.findElements(By.xpath("//div[@class='render']//table//tr//th"));
		int colSize1 = noOfCols1.size();
		System.out.println("The number of Column :"+colSize1);
		
		 //To get no of Rows of Table1
		List<WebElement> noOfRows1 = driver.findElements(By.xpath("//div[@class='render']//table//tr"));
		int rowSize1 = noOfRows1.size()-1;
		System.out.println("The number of Column :"+rowSize1);
		
		//To get no of Cols
		String tableName2 = driver.findElement(By.xpath("//h2[text()='Attributes of Create An HTML Table Quickly & Easily With Our Code Example']")).getText();
		System.out.println("The Table Name2:"+tableName2);
		List<WebElement> noOfCols2 = driver.findElements(By.xpath("//table[@class='attributes-list']//tr//th"));
		int colSize2 = noOfCols2.size();
		System.out.println("The number of Column :"+colSize2);
		
		//To get no of Rows
		List<WebElement> noOfRows2 = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		int rowSize2 = noOfRows2.size()-1;
		System.out.println("The number of Column :"+rowSize2);
		
		
	}

}