package com.atmecs.testscripts2;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



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
	
		obj.click(driver, locatorprops.getProperty("loc_shoptools_searchoption"));
		WebElement firstProduct=driver.findElement(By.xpath(locatorprops.getProperty("loc_shoptools_searchoption_type1")));
		firstProduct.sendKeys("pink drop shoulder oversized t shirt");
		firstProduct.sendKeys(Keys.ENTER);
        js.executeScript("window.scrollBy(0,500)");
		
		obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_color"));
		obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_color_chooseanoption"));
		driver.findElement(By.xpath(locatorprops.getProperty("loc_pinkdropoversizedtshirt_size")));
		obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_size_chooseansizeoption"));
		obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_addtocart"));
		
		obj.click(driver, locatorprops.getProperty("loc_shoptools_searchoption"));
	    WebElement secondProduct=driver.findElement(By.xpath(locatorprops.getProperty("loc_shoptools_searchoption_type1")));
	    secondProduct.sendKeys("pink fruit graphic fitted t shirt");
		secondProduct.sendKeys(Keys.ENTER);
	    js.executeScript("window.scrollBy(0,500)");
		
		obj.click(driver, locatorprops.getProperty("loc_pinkfruitgraphicfittedtshirtpink_color"));
		obj.click(driver, locatorprops.getProperty("loc_pinkfruitgraphicfittedtshirtpink_color_chooseanoption"));
		
		driver.findElement(By.xpath(locatorprops.getProperty("loc_pinkdropoversizedtshirt_size")));
		obj.click(driver, locatorprops.getProperty("loc_pinkfruitgraphicfittedtshirtpink_size_chooseanoption"));
		
        obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_addtocart"));
		
	    obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_viewcart"));
    
        js.executeScript("window.scrollBy(0,500)");
	    
	    WebElement firstProductValidation=driver.findElement(By.xpath(locatorprops.getProperty("loc_pinktshirt_firstproductvalidationpage")));
		String firstProductName=firstProductValidation.getText();
	    obj.verifyassert(firstProductName, locatorprops.getProperty("loc_pinktshirt_homepage_firstProductName"), "OverSized t-shirt is present in the cart ");
	    
	    WebElement secondProductValidation=driver.findElement(By.xpath(locatorprops.getProperty("loc_graphicfittedtshirt_secondproductvalidationpage")));
		String secondProductName=secondProductValidation.getAttribute(locatorprops.getProperty("loc_graphicfittedtshirt_secondProductValidation_attribute"));
        obj.verifyassert(secondProductName,(locatorprops.getProperty("loc_graphicfittedtshirt_homepage_secondProductName")), "fitted t-shirt is present in the cart ");

        WebElement firstProductPrice=driver.findElement(By.xpath(locatorprops.getProperty("loc_pinkdropoversizedtshirt_priceforthefirstproduct")));
    
        String textFirstPrice=firstProductPrice.getText();
	   
		String valu1 = textFirstPrice.replaceAll("[^0-9.]", "");
		double i = Double.parseDouble(valu1);
		System.out.println("1First_Product Price is: " + i);
		
		WebElement SecondProductPrice=driver.findElement(By.xpath(locatorprops.getProperty("loc_pinkfruitgraphicfittedtshirtpink_priceforthesecondproduct")));
		String textSecondPrice=SecondProductPrice.getText();
	   

	
		String valu2 = textSecondPrice.replaceAll("[^0-9.]", "");
		double j = Double.parseDouble(valu2);
		System.out.println("2First_Product Price is: " + j);
				
		WebElement FinalProductPrice=driver.findElement(By.xpath(locatorprops.getProperty("loc_granttotalprice")));
		String textGrantTotalPrice=FinalProductPrice.getText();
		
	    String valu3 = textGrantTotalPrice.replaceAll("[^0-9.]", "");
		double k = Double.parseDouble(valu3);
		System.out.println("GrantTotalPriceis: " + k );
		
		obj.click(driver, locatorprops.getProperty("loc_pinkdropoversizedtshirt_removeanitem"));
		
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement afterRemovalFinalProductPrice=driver.findElement(By.xpath(locatorprops.getProperty("loc_afterremoval_granttotalprice")));
		String textAfterRemovalGrantTotalPrice=afterRemovalFinalProductPrice.getText();
		
	    String valu4 = textAfterRemovalGrantTotalPrice.replaceAll("[^0-9.]", "");
		double l = Double.parseDouble(valu4);
		System.out.println("GrantTotalPriceis: " + l );
		
		
		
	}
	
	@AfterTest
	public void teardown()
	{
	driver.quit();

}

}
