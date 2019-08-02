package com.atmecs.testscripts;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.testsuite.TestBase;
import com.atmecs.util.PropertiesUtil;

public class FAQ extends TestBase{
	WebDriver driver;
	

	@BeforeTest
	public void setup()
	{
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();
		
	}
		
	@Test
	public void faq() 
	{

		PropertiesUtil   obj=new  PropertiesUtil ();
		WebElement gettitle=driver.findElement(By.xpath(menuprops.getProperty("FAQ_btn")));
		String faqtitle=gettitle.getText();
		obj.verifyassert(faqtitle,"FAQ","Validation is passed...");
		gettitle.click();
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	}
