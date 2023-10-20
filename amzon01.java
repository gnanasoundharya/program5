package novbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amzon01 {
	WebDriver driver;
	String url="https://www.amazon.in/";
	@BeforeClass
	public void amazon11()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	@Test
	public void amazon12()
	{
		WebElement web=driver.findElement(By.id("twotabsearchtextbox"));
		Actions at=new Actions(driver);
		at.moveToElement(web).click().keyDown(Keys.SHIFT).sendKeys("childdress").doubleClick().build().perform();
	}
	

}

