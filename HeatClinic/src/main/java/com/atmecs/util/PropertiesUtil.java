package com.atmecs.util;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import com.google.common.base.Function;

public class PropertiesUtil {
	public static Properties  loadProperty(String propertiesFilePath) {
		Properties properties = new Properties();
		PropertyParser propertyParser = new PropertyParser();
		
		
		try {
		properties = propertyParser.loadProperty(propertiesFilePath);
		} catch (IOException ioException) {
		System.out.println("IOException occured as " + ioException.getMessage());
		return null;
		}

		return properties;
		}
	
	
	
	public void verifyassert(String actual,String expected,String message)
	{
		
	Assert.assertEquals(actual,expected,message);
	System.out.println("Actual is: "+actual+" "+"Expected: "+expected+" "+"Message is: "+message);
	
	}
	
	
	
	
	
	public static void ignoreClickInterceptAndClickOnElement(WebDriver driver, final String xpath) 
	{
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).ignoring(ElementClickInterceptedException.class).pollingEvery(1, TimeUnit.SECONDS).withTimeout(30, TimeUnit.SECONDS);

		fluentWait.until(new Function<WebDriver, Boolean>() {
		public Boolean apply(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
		return true;
		}
		});
		}

}
