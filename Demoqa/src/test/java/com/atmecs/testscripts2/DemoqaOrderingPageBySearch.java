package com.atmecs.testscripts2;

import javax.annotation.RegEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.testsuite.TestBaseClass;
import com.atmecs.util.CommonUtilities;





			

public class DemoqaOrderingPageBySearch extends TestBaseClass
{
	
	
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
	public void bysearch() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		CommonUtilities obj = new CommonUtilities();
	
		obj.click(driver, testdataprops.getProperty("loc_shoptools_searchoption"));
		WebElement firstProduct=driver.findElement(By.xpath(testdataprops.getProperty("loc_shoptools_searchoption_type1")));
		firstProduct.sendKeys("pink drop shoulder oversized t shirt");
		firstProduct.sendKeys(Keys.ENTER);
        js.executeScript("window.scrollBy(0,500)");
		
		obj.click(driver, testdataprops.getProperty("loc_pinkdropoversizedtshirt_color"));
		driver.findElement(By.xpath("//option[@value='pink']")).click();
		driver.findElement(By.xpath(testdataprops.getProperty("loc_pinkdropoversizedtshirt_size")));
		driver.findElement(By.xpath("//option[@value='37']")).click();
		
		
	    obj.click(driver, testdataprops.getProperty("loc_pinkdropoversizedtshirt_addtocart"));
		
		
		
		
	    obj.click(driver, testdataprops.getProperty("loc_shoptools_searchoption"));
	    WebElement secondProduct=driver.findElement(By.xpath(testdataprops.getProperty("loc_shoptools_searchoption_type1")));
	    secondProduct.sendKeys("pink fruit graphic fitted t shirt");
		
	    secondProduct.sendKeys(Keys.ENTER);
		js.executeScript("window.scrollBy(0,500)");
		
		obj.click(driver, testdataprops.getProperty("loc_pinkdropoversizedtshirt_color"));
		driver.findElement(By.xpath("//option[@value='pink']")).click();
		driver.findElement(By.xpath(testdataprops.getProperty("loc_pinkdropoversizedtshirt_size")));
		driver.findElement(By.xpath("//option[@value='36']")).click();
		
		
	    obj.click(driver, testdataprops.getProperty("loc_pinkdropoversizedtshirt_addtocart"));
		Thread.sleep(5000);
	    obj.click(driver, testdataprops.getProperty("loc_pinkdropoversizedtshirt_viewcart"));
	    
	    js.executeScript("window.scrollBy(0,500)");
	    
	    WebElement firstProductValidation=driver.findElement(By.xpath("(//a[@href='http://shop.demoqa.com/product/pink-drop-shoulder-oversized-t-shirt/?attribute_pa_color=pink&attribute_pa_size=37'])[2]"));
		String firstProductName=firstProductValidation.getText();
	    obj.verifyassert(firstProductName, "PINK DROP SHOULDER OVERSIZED T SHIRT - PINK", "OverSized t-shirt is present in the cart ");
	Thread.sleep(3000);
	    WebElement secondProductValidation=driver.findElement(By.xpath("//a[text()='pink fruit graphic fitted t shirt - Pink']"));
		String secondProductName=secondProductValidation.getAttribute("href");
	    obj.verifyassert(secondProductName, "http://shop.demoqa.com/product/pink-fruit-graphic-fitted-t-shirt/?attribute_pa_color=pink&attribute_pa_size=36", "fitted t-shirt is present in the cart ");
	    
	    WebElement firstProductPrice=driver.findElement(By.xpath(("(//span[text()='15.00'])[3]")));
		String textFirstPrice=firstProductPrice.getText();
	   
		String valu1 = textFirstPrice.replaceAll("[^0-9.]", "");
		double i = Double.parseDouble(valu1);
		System.out.println("1First_Product Price is: " + i);
		
		}
	
	@AfterTest
	public void teardown()
	{
	driver.quit();

	}
	
}
