package com.atmecs.testsuite;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.atmecs.constants.ProjectPathConstants;
import com.atmecs.logreports.LogReportinformation;
import com.atmecs.util.PropertiesUtil;

public class TestBase  {
	LogReportinformation log=new LogReportinformation();
	WebDriver driver;

    public static Properties configProps = PropertiesUtil.loadProperty(ProjectPathConstants.config);
	public static Properties menuprops=PropertiesUtil.loadProperty(ProjectPathConstants.menu);
	
	public enum BrowserType {
	FIREFOX, CHROME, IE
	}
public WebDriver invokeBrowser() 
	{
	
		System.out.println("invoke");
	    String browser = configProps.getProperty("browserName");
	
	switch (BrowserType.valueOf(browser)) {
	case CHROME:{
	this.driver = setChromeDriver();
	System.out.println("Chrome driver set "+driver);
	log.info("chrome invoked...");
	break;
	}
	case FIREFOX:
	System.out.println("firefox case");
	this.driver = setFirefoxDriver();
	System.out.println("Firefox driver set "+driver);
	break;

	case IE:
	this.driver = setInterExplorerDriver();
	System.out.println("Internet driver set "+driver);
	default:
	break;
	}
	return driver;

	}

	private WebDriver setChromeDriver() {

		String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
		System.setProperty("webdriver.chrome.driver", currentdir + "chromedriver.exe");
		return new ChromeDriver();
	}

	private WebDriver setFirefoxDriver() {
	String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
	System.setProperty("webdriver.gecko.driver", currentdir + "geckodriver.exe");
	return new FirefoxDriver();
	}

	private WebDriver setInterExplorerDriver() {
	String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
	System.setProperty("webdriver.ie.driver", currentdir + "IEDriverServer.exe");
	return new InternetExplorerDriver();
	}
	public WebDriver windowOperation() {
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  return driver;
	
	

}
}