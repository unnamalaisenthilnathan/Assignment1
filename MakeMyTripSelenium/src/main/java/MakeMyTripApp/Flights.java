package MakeMyTripApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Flights extends Base{
@Test
public void SearchFlights() throws Exception
{
	openUrl();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
	driver.findElement(By.xpath("//p[text()='Hyderabad, India']")).click();
		
	
	
	}

	
	

	
	
	
	
	
	
	
}
