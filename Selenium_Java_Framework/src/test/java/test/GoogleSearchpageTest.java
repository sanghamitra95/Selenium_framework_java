package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchpageTest 
{
	static WebDriver driver=null;
   public static void main(String[] args) 
 
   {
	   googleSearchText();
   }
 
   public static void googleSearchText()
    {
	   String projectPath=System.getProperty("user.dir");
	   System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
	   driver =new ChromeDriver();
	   
	   GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
	   
	   driver.get("http://google.com/");
	   
	   searchPageObj.setTestSearchBox("Automation step by step");
	   searchPageObj.clickSeachButton();
	   
	   driver.close();
	   System.out.println("Test completed successfully");
	 
    }
}
