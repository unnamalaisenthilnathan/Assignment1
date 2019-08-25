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
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,400)");
obj.click(driver,locatorprops.getProperty( "loc_pinktshirt_homepage"));
js.executeScript("window.scrollBy(0,500)");
obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_color"));
obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_color_chooseanoption"));
driver.findElement(By.xpath(locatorprops.getProperty("loc_pinkdropoversizedtshirt_size")));
obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_size_chooseansizeoption"));
obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_addtocart"));
driver.navigate().back();
driver.navigate().back();
js.executeScript("window.scrollBy(0,1000)");
obj.click(driver, locatorprops.getProperty("loc_tokyotalkies_homepage"));
js.executeScript("window.scrollBy(0,500)");
obj.click(driver, locatorprops.getProperty("loc_tokyotalkies_color"));

Select dropdown = new Select(driver.findElement(By.id("color")));  
dropdown.selectByIndex(2); 

obj.click(driver, locatorprops.getProperty("loc_tokyotalkies_size"));

 dropdown = new Select(driver.findElement(By.id("size")));  
dropdown.selectByIndex(3);  

obj.click(driver, locatorprops.getProperty("loc_tokyotalkies_addtocart"));

obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_viewcart"));

js.executeScript("window.scrollBy(0,500)");

WebElement firstProductValidation=driver.findElement(By.xpath(locatorprops.getProperty("loc_pinktshirt_firstproductvalidationpage")));
String firstProductName=firstProductValidation.getText();
obj.verifyassert(firstProductName, "PINK DROP SHOULDER OVERSIZED T SHIRT - PINK", "OverSized t-shirt is present in the cart ");

WebElement secondProductValidation=driver.findElement(By.xpath(locatorprops.getProperty("loc_tokyotalkies_secondproductvalidationpage")));
String secondProductName=secondProductValidation.getText();
obj.verifyassert(secondProductName, "TOKYO TALKIES", "Maxi dress is present in the cart ");

WebElement firstProductPrice=driver.findElement(By.xpath(locatorprops.getProperty("loc_pinkdropoversizedtshirt_priceforthefirstproduct")));

String textFirstPrice=firstProductPrice.getText();

String valu1 = textFirstPrice.replaceAll("[^0-9.]", "");
double i = Double.parseDouble(valu1);
System.out.println("1First_Product Price is: " + i);

WebElement SecondProductPrice=driver.findElement(By.xpath(locatorprops.getProperty("loc_tokyotalkies_priceforthesecondproduct")));
String textSecondPrice=SecondProductPrice.getText();



String valu2 = textSecondPrice.replaceAll("[^0-9.]", "");
double j = Double.parseDouble(valu2);
System.out.println("2First_Product Price is: " + j);
	
WebElement FinalProductPrice=driver.findElement(By.xpath(locatorprops.getProperty("loc_directgranttotalprice")));
String textGrantTotalPrice=FinalProductPrice.getText();

String valu3 = textGrantTotalPrice.replaceAll("[^0-9.]", "");
double k = Double.parseDouble(valu3);
System.out.println("GrantTotalPriceis: " + k );



		}

	@AfterTest
public void teardown()
	{
	driver.quit();
}

	}



