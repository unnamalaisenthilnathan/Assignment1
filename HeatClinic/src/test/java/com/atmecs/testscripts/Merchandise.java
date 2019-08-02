package com.atmecs.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.atmecs.util.*;

import com.atmecs.testsuite.TestBase;

public class Merchandise extends TestBase {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();

	}

	@Test
	public void merchandise() {

		PropertiesUtil obj = new PropertiesUtil();

		

		WebElement gettitle = driver.findElement(By.xpath(menuprops.getProperty("btnmerchandise")));
		String merchandisetitle=gettitle.getText();
		obj.verifyassert(merchandisetitle,"MERCHANDISE","Validation is passed...");
		gettitle.click();
		
		gettitle = driver.findElement(By.xpath(menuprops.getProperty("btnmerchandise")));
		Actions act = new Actions(driver);
	    act.moveToElement(gettitle).perform();
	    gettitle = driver.findElement(By.xpath(menuprops.getProperty("dropdownmens")));
	    merchandisetitle=gettitle.getText();
        obj.verifyassert(merchandisetitle, "MENS","Validation is passed...");
	    gettitle.click();
        driver.navigate().back();

     	gettitle = driver.findElement(By.xpath(menuprops.getProperty("btnmerchandise")));
		act = new Actions(driver);
		act.moveToElement(gettitle).perform();
		gettitle = driver.findElement(By.xpath(menuprops.getProperty("dropdownwomens")));
		merchandisetitle=gettitle.getText();
     	obj.verifyassert(merchandisetitle, "WOMENS","Validation is passed...");
     	gettitle.click();

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
