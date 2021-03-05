package Selenium_Java_Framework.Selenium_Java_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleActionsMethodsDemo {

	public static void main(String[] args) 
	
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		WebElement textUserName=driver.findElement(By.name("email"));
		
		Actions builder=new Actions(driver);
		
		Action seriesOfActions=builder.moveToElement(textUserName).click().keyDown(textUserName, Keys.SHIFT).sendKeys(textUserName, "hello")
				.keyUp(textUserName, Keys.SHIFT)
				.doubleClick(textUserName)
				.contextClick()
				.build();
				
			seriesOfActions.perform() ;

			}
		
	

}
