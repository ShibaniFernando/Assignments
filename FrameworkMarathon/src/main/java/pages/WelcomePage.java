package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonCodes;

public class WelcomePage extends CommonCodes {
	public WelcomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public WelcomePage clickToggleButton() {

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}

	public AppLauncher clickViewAll() throws Exception {

		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(4000);
		return new AppLauncher(driver);
	}
}
