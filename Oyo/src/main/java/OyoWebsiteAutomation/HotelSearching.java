package OyoWebsiteAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HotelSearching extends BaseClass {
	@Test
	public void HotelSearch()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("autoComplete__home")).click();
		// driver.findElement(By.className("d-text16 geoSuggestionsList__locationName")).click();
	
		//driver.findElement(By.xpath("//span[contains(text(),'SilverKey Executive Stays 30730 Saket')]")).click();
	
	
	
	
	
	}
}
