package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.GoogleSearchPageObjects;

public class ExtentReportDemo {
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException 
	
	{
	
		ExtentReports extent = new ExtentReports();
		
		//This will save a html file named as spark.html inside target folder.
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		//Create a test case
		ExtentTest test1=extent.createTest("Google search test one");
		
		   String projectPath=System.getProperty("user.dir");
		   System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver//chromedriver.exe");
		   driver =new ChromeDriver();
		   test1.log(Status.INFO, "Starting the Test");
		   
		   GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
		   
		   driver.get("http://google.com/");
		   test1.pass("Navigated to google.com");
		   
		   searchPageObj.setTestSearchBox("Automation step by step");
		   test1.pass("Entered the text in search box");
		   Thread.sleep(2000);
		   searchPageObj.clickSeachButton();
		   test1.pass("Clicked on the search button");
		   
		   driver.close();
		   driver.quit();
		   
		   test1.info("Test Is Completed");
		   //Calling flush write everything to the logs
		   extent.flush();
		 
		
	}

}
