package Selenium_Java_Framework.Selenium_Java_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPageObjects;

public class TestNgDemo2 {
	static WebDriver driver=null;
	 @BeforeTest
		public void setUpTest()
		{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	 @Test
		public void googleSearch2() throws InterruptedException
		{
		 driver.get("http://google.com/");
		   driver.findElement(By.name("q")).sendKeys("Automation step by step");
		 //  searchPageObj.setTestSearchBox();
		   driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		   
			   
		}
	@AfterTest
		public void tearDown()
		{
		driver.close();
		
		System.out.println("The test is completed successfully");
		}
	
	
}
