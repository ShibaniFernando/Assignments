package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonCodes;

public class AppLauncher extends CommonCodes {
	
	public AppLauncher(ChromeDriver driver) {
		this.driver = driver;
	}

	public IndividualsPage clickIndividuals() throws Exception {
		Thread.sleep(3000);
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		return new IndividualsPage(driver);
	}
}
