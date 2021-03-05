package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects 
{ 
	static WebDriver driver=null;
	
	 By textbox_search= By.name("q");
	By button_search= By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public  void setTestSearchBox(String text)
	{
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	
	public void clickSeachButton()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
