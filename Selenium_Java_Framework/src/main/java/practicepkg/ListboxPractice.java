package practicepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxPractice {

	public static void main(String[] args) 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		driver.manage().window().maximize();
		
		WebElement listbox= driver.findElement(By.id("multiselect"));
		
		Select s=new Select(listbox);
		
		//selectByValue()
		s.selectByValue("suzuki");
		System.out.println("The list box is selected by value");
		//deselectByValue()
		s.deselectByValue("suzuki");
		System.out.println("The list box is deselected by value");
		
		//selectByIndex()
		s.selectByIndex(5);
		System.out.println("The list box is selected by Index");
		//deselectByIndex()
		s.deselectByIndex(5);
		System.out.println("The list box is deselected by Index");
		
		//Select multiple options
		
		if(s.isMultiple())
		{
			//Get all the options and its size
			List<WebElement> listoptions=s.getOptions();
			System.out.println("The size of the listbox is:"+listoptions.size());
		    for(WebElement option1:listoptions)
		    {
		    	System.out.println("All the options are:"+option1.getText());
		    }
			
			s.selectByValue("volvo");
			s.selectByIndex(1);
			s.selectByVisibleText("Audi");
		
		//get first selected value
	      WebElement option1 =s.getFirstSelectedOption();
	      System.out.println("The 1st selected option is:"+option1.getText());
	    
	    //Get all selected options
	    List<WebElement> options= s.getAllSelectedOptions();
	    for(WebElement option:options)
	    System.out.println("All the selected options are:"+option.getText());
		}
		
		else
		{
			System.out.println("The dropdown is not multi select");
		}
		s.deselectAll();
		System.out.println("The dropdown is desected all option");
		
		driver.quit();
		
		
	}

}
