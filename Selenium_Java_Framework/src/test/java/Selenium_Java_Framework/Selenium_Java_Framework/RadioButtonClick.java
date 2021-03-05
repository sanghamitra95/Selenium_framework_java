package Selenium_Java_Framework.Selenium_Java_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClick {

	public static void main(String[] args) throws InterruptedException
	{   
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		
		///Click check box
		
		WebElement check1=driver.findElement(By.id("vfb-6-0"));
		
		check1.click();
		if(check1.isSelected()) {
		System.out.println("The check box 1 is clicked");
		
		}
		else {
			System.out.println("The check box 1 is not clicked");
		}
		check1.click();
		if(!check1.isSelected())
		{System.out.println("The check box is not clicked");
		
		}
		
		Thread.sleep(3000);
			
	////Radio group check
		
		WebElement radio1=driver.findElement(By.id("vfb-7-1"));
		WebElement radio2=driver.findElement(By.id("vfb-7-2"));
		WebElement radio3=driver.findElement(By.id("vfb-7-3"));
		
		radio1.click();
		System.out.println(radio1.isSelected());
		Thread.sleep(3000);
		
		 //Selecting Checkbox and using isSelected Method
		 
		driver.get("http://demo.guru99.com/test/facebook.html");					
	        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
	        for (int i=0; i<2; i++) {											
	            chkFBPersist.click (); 			
	            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());			
			
			
			
			
	        driver.close();
	        //driver.quit();
	}
	}
}

