package Selenium_Java_Framework.Selenium_Java_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) 
	
	{
		// Single select dropdown
		
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		Select countryDrop=new Select(driver.findElement(By.name("country")));
		
		countryDrop.selectByVisibleText("INDIA");
		System.out.println("The country is selected as INDIA");
	
	  
	///Multiple selection in drop down
		
		driver.get("http://jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		Select multiSelect=new Select(driver.findElement(By.id("fruits")));
		multiSelect.selectByIndex(1);
		multiSelect.selectByVisibleText("Orange");
		
		System.out.println("Orange and Apple is selected");
		
driver.close();
	
	}

}
