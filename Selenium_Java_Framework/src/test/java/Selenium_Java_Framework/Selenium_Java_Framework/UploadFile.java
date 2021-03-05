package Selenium_Java_Framework.Selenium_Java_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadFile {

	public static void main(String[] args) 
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement uploadFile=driver.findElement(By.id("uploadfile_0"));
		
		uploadFile.sendKeys("C:\\Users\\hp\\Downloads\\uploadfile.pdf");//path of the file u want to upload
		
		//Click on terms check box
		driver.findElement(By.id("terms")).click();
		
		//Click on submit button
		driver.findElement(By.id("submitbutton")).sendKeys(Keys.RETURN);
		
		
		
		

	}

}
