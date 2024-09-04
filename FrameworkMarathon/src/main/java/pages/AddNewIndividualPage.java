package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonCodes;

public class AddNewIndividualPage extends CommonCodes {
	public AddNewIndividualPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public AddNewIndividualPage enterName(String name) {
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(name);
		return this;
	}

	public VerifyNewCreation clickSave() {

		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return new VerifyNewCreation(driver);
	}
}
