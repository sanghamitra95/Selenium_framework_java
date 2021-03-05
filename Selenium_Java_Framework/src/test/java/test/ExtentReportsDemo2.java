package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReportsDemo2 
{
	static ExtentReports reports;
	static ExtentTest test;
	static WebDriver driver;
	
@BeforeTest
public void startTest()
{
	//reports = new ExtentReports("ExtentReportResults.html");
	
}

	

}


