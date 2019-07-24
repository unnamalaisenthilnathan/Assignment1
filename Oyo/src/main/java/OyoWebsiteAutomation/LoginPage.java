package OyoWebsiteAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {
	@Test
	public void Loginpage()
	{
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//div[@class='sideMenuAuthButton__text']")).click();
		driver.findElement(By.xpath("//input[@class='textTelInput__input']")).sendKeys("8681816692");
		driver.findElement(By.xpath("//button[contains(text(),'Click here')]")).click();
		driver.findElement(By.xpath("//input[@class='textInput__input']")).sendKeys("9582");
		driver.findElement(By.xpath("//button[contains(text(),'Verify Number')]")).click();
	}
	
	}
