package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealPage {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//clicking men fashion
		d.findElement(By.xpath("//div[@class='leftNavWrapperRevamp']//ul/li")).click();
		
		

	}

}
