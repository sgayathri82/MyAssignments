package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
// 1. Launch the URL https://html.com/tags/table/
//2. Get the count of number of rows
//3. Get the count of number of columns
*/	
public class HTML {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 1. Launch the URL https://html.com/tags/table/
		
		driver.get("https://html.com/tags/table/");
		
		String table1Name = driver.findElement(By.xpath("//caption")).getText();
		System.out.println("Table 1 name is: "+table1Name);
		List<WebElement> table1Rows = driver.findElements(By.xpath("//div[@class='render']//table//tr"));
		List<WebElement> table1Columns = driver.findElements(By.xpath("//div[@class='render']//table//tr//th"));

		System.out.println("Number of rows in Table1: "+table1Rows.size());
		System.out.println("Number of columns in Table1: "+table1Columns.size());

		String table2Name = driver.findElement(By.xpath("(//h2)[3]")).getText();
		System.out.println("Table 2 name is: "+table2Name);
		List<WebElement> table2Rows = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		List<WebElement> table2Columns = driver.findElements(By.xpath("//table[@class='attributes-list']//tr//th"));

		System.out.println("Number of rows in Table2: "+table2Rows.size());
		System.out.println("Number of columns in Table2: "+table2Columns.size());

		driver.close();

	}

}
