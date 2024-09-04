package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonCodes;

public class VerifyEditPage extends CommonCodes {
	public VerifyEditPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public void VerifyEdit() throws Exception {

		Thread.sleep(2000);
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		// Verify the first name as 'Ganesh'
		System.out.println(msg);
	}
}
