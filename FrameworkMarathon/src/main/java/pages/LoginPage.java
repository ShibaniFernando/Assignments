package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonCodes;

public class LoginPage extends CommonCodes {
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUsername(String username) {

		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	public WelcomePage clickLogin() {
		driver.findElement(By.id("Login")).click();
		return new WelcomePage(driver);
	}
}
