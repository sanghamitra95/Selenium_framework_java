package practicepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com/examples/register.html");
		driver.manage().window().maximize();
		
		//Select option from dropdown
		 WebElement drop1=driver.findElement(By.xpath("//body/div[@id='login']/form[1]/fieldset[1]/p[3]/select[1]"));
		 System.out.println("The dropdown webelement is located");
		 
		 Select s=new Select(drop1);
		 
		 //Get all options
		 
		 if(s.isMultiple())
		 {
			System.out.println("The drop down is multiple select");
			List<WebElement> dropOptions= s.getOptions();
			for(WebElement dropOption:dropOptions)
			{
				System.out.println("The Options in dropdown are:"+dropOption.getText());
			}
		 }	
		else
			{
				System.out.println("The dropdown is not multiselect");
			}
		 
		 //*** We can use deselect method for multi select dropdown ***////
		 
		 //selectByvalue
		 s.selectByValue("Mega123");
		 System.out.println("The dropdown is selected by value");
		 //s.deselectByValue("Mega123");
		 //System.out.println("The dropdown is selected by value");
		 
		 //selectByVisibleText
		 s.selectByVisibleText("Serene Pad 64G");
		 System.out.println("The dropdown is selected by visible text");
		 //s.deselectByVisibleText("Serene Pad 64G");
		 //System.out.println("The dropdown is deselected by Visible text");
		 
		 //selectByindex
		 
		 s.selectByIndex(1);
		 System.out.println("The dropdown is selected by index"); 
		 //s.deselectByIndex(1);
		 //System.out.println("The dropdown is deselected by index");
		 
		 System.out.println("Test completed successfully");
		 driver.close();
		 driver.quit();
}}
