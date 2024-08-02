package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frame1 = d.findElement(By.xpath("//iframe[@id='iframeResult']"));
		d.switchTo().frame(frame1);
		d.findElement(By.xpath("//h2[contains(text(),'Confirm Box')]/following::button")).click();
		Alert simple = d.switchTo().alert();
		simple.accept();
		String text = d.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println(text);
		if (text.equalsIgnoreCase("You pressed OK")) {
			System.out.println("true");
		}else
			System.out.println("False");
	}
	

}
