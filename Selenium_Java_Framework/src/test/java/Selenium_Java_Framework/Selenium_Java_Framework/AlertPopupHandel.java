package Selenium_Java_Framework.Selenium_Java_Framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandel {

	public static void main(String[] args) throws Exception
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("aacv");
		driver.findElement(By.name("submit")).submit();
		
		//after clicking on submit an alert popup will come,
		//We need to switch to alert popup
		
		Alert alert=driver.switchTo().alert();
		
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println("The alert message is"+alertMessage);
		
		Thread.sleep(2000);
		alert.accept();
		System.out.println("ALert is clicked	");
		

	}

}
