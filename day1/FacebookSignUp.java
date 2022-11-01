package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Gayathri");
		driver.findElement(By.name("lastname")).sendKeys("Thyagarajan");
		driver.findElement(By.name("reg_email__")).sendKeys("gayu@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Gayu");
		driver.findElement(By.name("sex")).click();
		
		WebElement  select1= driver.findElement(By.id("day"));
		Select obj1=new Select(select1);
		obj1.selectByValue("26");
		
		WebElement  select2= driver.findElement(By.id("month"));
		Select obj2=new Select(select2);
		obj2.selectByVisibleText("Oct");
		
		
		WebElement  select3= driver.findElement(By.id("year"));
		Select obj3=new Select(select3);
		obj3.selectByIndex(30);
	}

}

