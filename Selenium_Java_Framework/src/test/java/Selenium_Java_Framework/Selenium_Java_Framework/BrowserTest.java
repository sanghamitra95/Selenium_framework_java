package Selenium_Java_Framework.Selenium_Java_Framework;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest 
	{
	  public static void main(String[] args)
	  
	  {
		  String projectPath=System.getProperty("user.dir");
		  System.out.println("Project path:"+projectPath);
		  
		  //System.setProperty("webdriver.gecko.driver", projectPath+"//drivers//geckodriver//geckodriver.exe");
		  //WebDriver driver=new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
		  
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("http://google.com/");
		  driver.findElement(By.name("q")).sendKeys("abcd");
		 List<WebElement> listOfWebelements= driver.findElements(By.xpath("//input"));
		int count= listOfWebelements.size();
		
		 System.out.println(count);
		  driver.close();
	  }

	}
