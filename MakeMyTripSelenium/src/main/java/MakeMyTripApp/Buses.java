package MakeMyTripApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Buses extends Base{
	@Test
	public void searchBuses() throws Exception
	{
		openUrl();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[2]/div/div/nav/ul/li[5]/a/span[2]")).click();
		driver.findElement(By.id("fromCity")).click();
		
		if(properties.getProperty("fromcity").equalsIgnoreCase("Hyderabad,Telangana"))
		{
		driver.findElement(By.xpath("//span[contains(text(),'Hyderabad, Telangana')]")).click();
		}
		else if(properties.getProperty("fromcity").equalsIgnoreCase("Delhi,Delhi"))
		{
		driver.findElement(By.xpath("//span[contains(text(),'Delhi, Delhi')]")).click();
		}
		
		if(properties.getProperty("tocity").equalsIgnoreCase("Chennai,Tamil Nadu"))
		{
		driver.findElement(By.xpath("//span[text()='Chennai, Tamil Nadu']")).click();
		}
		else if(properties.getProperty("tocity").equalsIgnoreCase("Bangalore, Karnataka"))
		{
			driver.findElement(By.xpath("//span[text()='Bangalore, Karnataka']")).click();
		}
	
		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']")).click();
		
	
		driver.findElement(By.cssSelector("[class='makeFlex vrtlCenter '] [class='primaryBtn font24 latoBlack widgetSearchBtn ']")).click();
		
	}
	
	

}
