package novbatch;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clg001 {
		WebDriver driver;
		String url="https://www.bput.ac.in/";
		String url1="https://www.google.com/";
		@BeforeTest
		public void clg02()
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(op);
			driver.get(url);
			//driver.get(url1);
			}
     @Test
		public void clg03()
		
		{
	WebElement click=driver.findElement(By.linkText("About Us"));
	WebElement click1=driver.findElement(By.linkText("Governance"));
	Actions act =new Actions(driver);
					act.moveToElement(click).build().perform();
					act.moveToElement(click1).build().perform();
		}
		//@Test
		public void gmail01() throws InterruptedException, AWTException
		{
			WebElement s=driver.findElement(By.linkText("Gmail"));
			Actions act=new Actions(driver);
			act.contextClick(s).build().perform();
			Robot ro=new Robot();
			ro.keyPress(MenuKeyEvent.VK_DOWN);
			ro.keyPress(MenuKeyEvent.VK_ENTER);
			Thread.sleep(3000);
			ro.keyPress(MenuKeyEvent.VK_CONTROL);
			ro.keyPress(MenuKeyEvent.VK_TAB);
			System.out.println(driver.getTitle());			
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	Set<String>tabs=driver.getWindowHandles();
	System.out.println(tabs);
	for(String handles:tabs)
	{
		driver.switchTo().window(handles);
		System.out.println(driver.getTitle());
	}
	driver.switchTo().window(parent);
	//driver.get("https://www.google.com/search?q=demoqa&oq=demoqa&aqs=chrome..69i57.4419j0j15&sourceid=chrome&ie=UTF-8");
	
}		
		
	}

