package com.atmecs.testscripts2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.testsuite.TestBaseClass;
import com.atmecs.util.CommonUtilities;

public class DemoqaOrderingPageBySearch extends TestBaseClass{
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
	public void bysearch() {

		CommonUtilities obj = new CommonUtilities();
		obj.click(driver, testdataprops.getProperty("loc_shoptools_searchoption"));
		ele=driver.findElement(By.xpath(testdataprops.getProperty("loc_shoptools_searchoption_type1")));
		ele.sendKeys(Keys.ENTER);
		obj.click(driver, testdataprops.getProperty("loc_shoptools_pinkdropoversizedtshirt"));
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
	    obj.assertion(driver, testdataprops.getProperty("loc_pinkdropoversizedtshirt_viewcart"), "");
	    
	    
	}
	
	@AfterTest
	public void teardown()
	{
	driver.quit();
	}
	
}
