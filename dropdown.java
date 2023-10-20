package novbatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
		WebDriver driver;
		String url="https://rahulshettyacademy.com/dropdownsPractise/";
		@BeforeTest
		public void static01()
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(op);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
}
		@Test
		public void static02() throws InterruptedException
		{
		WebElement web=driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
        Select dropdown=new Select((web));
        Thread.sleep(3000);
		dropdown.selectByVisibleText("AED");
		//dropdown.selectByIndex(3);
		//dropdown.selectByValue("USD");
}
}
