package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonCodes;

public class IndividualsPage extends CommonCodes {
	public IndividualsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public AddNewIndividualPage clickNew() {

		driver.findElement(By.xpath("//div[text()='New']")).click();
		return new AddNewIndividualPage(driver);
	}

	public IndividualsPage searchIndividual() throws Exception {
		WebElement name = driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys("shibani");
		name.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		return this;

	}

	public EditPage clickEdit() throws Exception {
		Thread.sleep(2000);
		WebElement ele = driver
				.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", ele);
		Thread.sleep(3000);
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
		driver.executeScript("arguments[0].click();", edit);
		driver.findElement(By.xpath("//a[@class='select']")).click();
		Thread.sleep(3000);
		return new EditPage(driver);

	}
}
