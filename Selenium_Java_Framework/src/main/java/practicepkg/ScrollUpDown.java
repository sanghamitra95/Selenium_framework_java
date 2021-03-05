package practicepkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		/**-------------JavascriptExecutor----------------------------
		driver.get("https://techcanvass.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(5000);
		System.out.println("The page scrolled successfully");
		driver.close();
		**/
		//----------------------------Actions class----------------------
		
		 driver.get("https://www.amazon.com/");

	      Actions actions = new Actions(driver);

	      // Scroll Down using Actions class
	      actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	      Thread.sleep(5000);
	   // Scroll Up using Actions class
	      actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      //Thread.sleep(5000);
	      driver.close();

	}

}
