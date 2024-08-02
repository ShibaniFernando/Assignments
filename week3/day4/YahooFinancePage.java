package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooFinancePage {

	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		d.get("https://finance.yahoo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//perform mousehover on more button 
		Actions act = new Actions(d);
		WebElement morebutton = d.findElement(By.xpath("//ul[@id='ybar-l1-nav']/li[4]/button"));
		act.moveToElement(morebutton).perform();
		
		//clicking crypto button
		d.findElement(By.xpath("//a[text()='Crypto ']")).click();
		
		

	}

}
