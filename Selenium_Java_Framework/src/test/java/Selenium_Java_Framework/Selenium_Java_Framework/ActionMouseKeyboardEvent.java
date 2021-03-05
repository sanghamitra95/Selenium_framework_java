package Selenium_Java_Framework.Selenium_Java_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseKeyboardEvent {

	public static void main(String[] args) 
	
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		WebElement homeLink=driver.findElement(By.linkText("Home"));
		WebElement td_home=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		
		Actions builder=new Actions(driver);
		
		Action mouseOverHome=builder.moveToElement(homeLink).build();
		
		//After mouseover on home link it will change the color to validate that we can fetch the xpath of home and then
		//use that element to get color of the home link and validate mouse action is performed[getCssValue("background-color");]
		
		String beforeHover=td_home.getCssValue("background-color");
		System.out.println("Before mouse-over on home link the color is:"+beforeHover);
		mouseOverHome.perform();
		String afterHover=td_home.getCssValue("background-color");
		System.out.println("After mouse-over on home link the color is:"+afterHover);
		
		driver.close();
		

	}

}
