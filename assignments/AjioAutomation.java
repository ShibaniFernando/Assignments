package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AjioAutomation {

	public static void main(String[] args) throws Exception {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver d= new ChromeDriver(options);
		d.get("https://www.ajio.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//entering bags in search
		d.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(3000);
		
		//clicking men under gender
		d.findElement(By.xpath("(//ul[@class='rilrtl-list ']/li)[3]/div")).click();
		Thread.sleep(3000);
		//clicking fashion bags
		d.findElement(By.xpath("(//ul[@class='rilrtl-list '])[3]/li[3]/div")).click();

	}

}
