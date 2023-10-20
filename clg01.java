package novbatch;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clg01 {
	WebDriver driver;
	String url="https://www.bput.ac.in/";
	@BeforeTest
	public void clg02()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
	}
	public void clg03()
	{
WebElement click=driver.findElement(By.linkText("About Us"));
Actions act =new Actions(driver);
				act.moveToElement(click).build().perform();
				
				
	}
}
