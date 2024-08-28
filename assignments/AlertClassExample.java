package assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassExample {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.leafground.com/alert.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Clicking prompt alert button
		d.findElement(By.name("j_idt88:j_idt104")).click();

		// Switching driver focus to alert
		Alert a = d.switchTo().alert();
		a.sendKeys("Shibani");
		a.dismiss();
		
		//to retrieve the text
		String text = d.findElement(By.id("confirm_result")).getText();
		if (text.contains("User cancelled the prompt.")) {
			System.out.println("The Alert was cancelled successfully");
		}

	}

}
