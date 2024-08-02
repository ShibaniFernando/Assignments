package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptDialogBox {

	public static void main(String[] args) throws Exception {
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.leafground.com/alert.xhtml");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert promptAlert = d.switchTo().alert();
		Thread.sleep(2000);
		promptAlert.sendKeys("Shibani");
		
	
		promptAlert.dismiss();
		
		String text = d.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		if (text.equals("User cancelled the prompt.")) {
			System.out.println("Expected Result");
		}
		else {
			System.out.println("Text is not matching");
		}
				
		
	}

}
