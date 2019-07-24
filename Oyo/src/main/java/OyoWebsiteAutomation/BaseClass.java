package OyoWebsiteAutomation;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BaseClass {
	public WebDriver driver;
	public String path="Oyo.properties";
	public Properties properties;
	public FileInputStream fis;
	
	public void chooseBrowser() throws Exception
	{
		properties=new Properties();
		fis=new FileInputStream(path);
		properties.load(fis);
		if(properties.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Unnamalai.S\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}	
		else if(properties.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Unnamalai.S\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"); 
			driver=new ChromeDriver();
		}
		 
		else if(properties.getProperty("browser").equalsIgnoreCase("internetexplorer"))
		{
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Unnamalai.S\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe"); 
			driver=new InternetExplorerDriver();
		}
		
	}
	@Test
	public void openUrl() throws Exception
	{
		chooseBrowser();
		driver.get(properties.getProperty("url"));
	}
	public void quitUrl() throws Exception
	{
		chooseBrowser();
	    driver.quit();
	}
	
	
}
