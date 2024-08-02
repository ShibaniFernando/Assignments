package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookregistration {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();

		d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		Thread.sleep(2000);
		d.findElement(By.name("firstname")).sendKeys("Shibani");
		d.findElement(By.name("lastname")).sendKeys("Morais");
		d.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9047033201");
		d.findElement(By.id("password_step_input")).sendKeys("Miguel@25");
		WebElement date = d.findElement(By.id("day"));
		Select days = new Select(date);
		days.selectByVisibleText("25");

		WebElement month = d.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByVisibleText("Feb");

		WebElement year = d.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("2013");

		d.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(1000);
		d.findElement(By.name("websubmit")).click();

	}
}
