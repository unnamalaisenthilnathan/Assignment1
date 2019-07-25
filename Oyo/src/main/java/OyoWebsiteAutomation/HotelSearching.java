package OyoWebsiteAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HotelSearching extends BaseClass {
	@Test
	public void HotelSearch() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='autoComplete__home']")).sendKeys("Gachibowli,Hyderabad,Telangana");
		
		driver.findElement(By.xpath("//div[@class='oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone d-text16 is-fontBold datePickerDesktop__checkInOut u-textEllipsis']")).click();
		
		driver.findElement(By.xpath("//div[@class='oyo-row oyo-row--no-spacing guestRoomPicker guestRoomPicker--home ']")).click();
		
		driver.findElement(By.xpath("//span[@class='guestRoomPickerPopUp__plus']")).click();
		
		
		
		driver.findElement(By.xpath("//button[@class='u-textCenter searchButton searchButton--home']")).click();
		
	}
}
