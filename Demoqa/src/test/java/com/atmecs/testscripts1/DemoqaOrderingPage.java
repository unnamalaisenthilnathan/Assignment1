package com.atmecs.testscripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,1000)");
obj.click(driver, testdataprops.getProperty("loc_shoptools_forladies_pinktshirt"));
obj.click(driver, testdataprops.getProperty("loc_pinkdropoversizedtshirt_color"));
ele = driver.findElement(By.xpath(testdataprops.getProperty("loc_pinkdropoversizedtshirt_color")));
Select dropdown = new Select(ele);  
dropdown.selectByIndex(1);
ele=driver.findElement(By.xpath(testdataprops.getProperty("loc_pinkdropoversizedtshirt_size")));
dropdown=new Select(ele);
dropdown.selectByIndex(1);
obj.click(driver, testdataprops.getProperty("loc_pinkdropoversizedtshirt_quantity"));
obj.click(driver, testdataprops.getProperty("loc_pinkdropoversizedtshirt_addtocart"));
obj.click(driver, testdataprops.getProperty("loc_pinkdropoversizedtshirt_viewcart"));

//obj.click(driver, testdataprops.getProperty("loc_shoptools_forladies_choosecolor"));
//obj.click(driver, testdataprops.getProperty("loc_shoptools_forladies_quantity"));
//obj.click(driver, testdataprops.getProperty("loc_shoptools_forladies_size"));
//obj.click(driver, testdataprops.getProperty("loc_shoptools_forladies_quantity_addtocart"));

		}

	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	}



