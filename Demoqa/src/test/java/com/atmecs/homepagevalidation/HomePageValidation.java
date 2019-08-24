package com.atmecs.homepagevalidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.testsuite.TestBaseClass;
import com.atmecs.util.CommonUtilities;

public class HomePageValidation extends TestBaseClass
{
	WebDriver driver;
	WebElement ele;
	
	@BeforeTest
	public void setup()
	{
		
		
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();
		
}
	
	@Test	
	public void homepage() 
	{
CommonUtilities obj=new CommonUtilities();
obj.click(driver, testdataprops.getProperty("loc_shoptools_checkout"));











}
	
	
	
	
	
	
	
	
	
	

}
