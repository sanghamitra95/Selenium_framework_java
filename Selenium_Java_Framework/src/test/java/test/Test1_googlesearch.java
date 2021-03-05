package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class Test1_googlesearch {
	static WebDriver driver=null;

	public static void main(String[] args) 
	{
		googleSearch();

	}

	public static void googleSearch()
	{
		String projectPath=System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
		  driver=new ChromeDriver();
		  /*Go to google.com*/
		  driver.get("http://google.com/");
		  
		  //driver.findElement(By.name("q")).sendKeys("Automation step by step");
		  
		  GoogleSearchPage.textBox_Search(driver).sendKeys("Automation step by step");
		  
		  //driver.findElement(By.name("btnK")).click();
		  //driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		  
		  GoogleSearchPage.button_Search(driver).sendKeys(Keys.RETURN);
		  
		  driver.close();
		  System.out.println("Test completed successfully");
		  
	}
}
