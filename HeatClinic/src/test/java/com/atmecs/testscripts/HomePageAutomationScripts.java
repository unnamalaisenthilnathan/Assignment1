package com.atmecs.testscripts;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.heatclinic.pages.HomePage;
import com.atmecs.testsuite.TestBase;
import com.atmecs.util.PropertiesUtil;

public class HomePageAutomationScripts extends TestBase {
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
public void homepage() 
{
	
	PropertiesUtil   obj=new  PropertiesUtil ();
	
	WebElement gettitle=driver.findElement(By.xpath(menuprops.getProperty("home")));
	String homeTitle=gettitle.getText();
	obj.verifyassert(homeTitle,"HOME","Validation is passed...");
	

	HomePage.homepageautomationscripts(driver, menuprops.getProperty("btnshopforapparel"));
    System.out.println("Title 2: "+driver.getTitle());	
    driver.navigate().back();
    HomePage.homepageautomationscripts(driver, menuprops.getProperty("hotsauceaficionadoreg"));
    


}

@AfterTest
public void teardown()
{
	driver.quit();
}



}
