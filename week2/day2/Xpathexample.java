package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexample {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();

		d.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		d.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

	}

}
