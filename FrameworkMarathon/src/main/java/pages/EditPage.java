package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonCodes;

public class EditPage extends CommonCodes {
	public EditPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public EditPage editTitle() throws Exception {
		driver.findElement(By.xpath("//a[text()='Ms.']")).click();
		Thread.sleep(2000);
		return this;

	}

	public EditPage editName() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys("Jude");
		return this;
	}

	public VerifyEditPage clickSaveEdit() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return new VerifyEditPage(driver);
	}
}
