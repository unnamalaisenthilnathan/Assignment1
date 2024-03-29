package com.atmecs.testscripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.logreports.LogReportinformation;
import com.atmecs.testsuite.TestBase;
import com.atmecs.util.CommonUtilities;


public class NewToHotSauce extends TestBase {
WebDriver driver;
LogReportinformation log=new LogReportinformation();	
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
		CommonUtilities   obj =new  CommonUtilities ();
		obj.ClickOnElement(driver, menuprops.getProperty("btn_newtohotsauce"), "NEW TO HOT SAUCE?");
        log.info(driver.getTitle());
	
	}

	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	}
