package Selenium_Java_Framework.Selenium_Java_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialLinkText {

	public static void main(String[] args)
	{
		// click on the basis of linktext
		
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/accessing-link.html");
		driver.manage().window().maximize();
		
		String theLinkText=driver.findElement(By.linkText("here")).getText();
		
		System.out.println(driver.getTitle());
		

	}

}
