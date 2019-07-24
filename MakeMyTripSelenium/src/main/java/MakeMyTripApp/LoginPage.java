package MakeMyTripApp;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends Base {
	@Test
	public void login() throws Exception
	{
		openUrl();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//p[contains(text(),'Login or Create Account')]")).click();
	
		driver.findElement(By.id("username")).sendKeys(properties.getProperty("username"));
	
		driver.findElement(By.id("password")).sendKeys(properties.getProperty("password"));
	
		
		
	driver.findElement(By.xpath("//span[@class='font14 darkGreyText latoBold']")).click();
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("unnamalai.senthilnathan@atmecs.com");
	}
}
