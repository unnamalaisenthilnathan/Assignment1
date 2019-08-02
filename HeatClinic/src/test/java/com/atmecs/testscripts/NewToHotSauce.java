package com.atmecs.testscripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.testsuite.TestBase;
import com.atmecs.util.PropertiesUtil;

public class NewToHotSauce extends TestBase {
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
	public void newtohotsauce()
	{
		PropertiesUtil   obj =new  PropertiesUtil ();
		WebElement gettitle=driver.findElement(By.xpath(menuprops.getProperty("btn_newtohotsauce")));
		String newtohotsaucetitle=gettitle.getText();
		obj.verifyassert(newtohotsaucetitle,"NEW TO HOT SAUCE?","Validation is passed...");
        gettitle.click();
        System.out.println(driver.getTitle());
	
	}

	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	}
