package com.atmecs.testscripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import com.atmecs.logreports.LogReportInformation;
import com.atmecs.testsuite.TestBaseClass;
import com.atmecs.util.CommonUtilities;



public class DemoqaOrderingPage extends TestBaseClass
{
	
WebDriver driver;
WebElement ele;
LogReportInformation log=new LogReportInformation();
	@BeforeTest
	public void setup()
	{
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();
		
	}
	
	
	
	@Test	
	public void orders() 
	{
CommonUtilities obj=new CommonUtilities();












		}

	@AfterTest
public void teardown()
	{
	driver.quit();
}
	
	}



