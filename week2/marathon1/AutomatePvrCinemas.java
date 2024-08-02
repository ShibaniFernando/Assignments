package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatePvrCinemas {

	public static void main(String[] args) throws Exception {
		ChromeDriver d = new ChromeDriver();
		d.get("https://uae.voxcinemas.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.findElement(By.xpath("//span[@class='label']")).click();
		d.findElement(By.xpath("(//ol[@class='values']/li)[1]")).click();
		d.findElement(By.xpath("//a[text()='Done']")).click();
		
		d.findElement(By.xpath("//span[@data-all='Any Movie']")).click();
		d.findElement(By.xpath("(//div[@class='pseudo-multi-select movies active']//div//ol/li)[31]")).click();
		d.findElement(By.xpath("(//div[@class='pseudo-multi-select movies active']//div)[4]/a[@class='action primary done']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//form[@class='quick-filter']//button")).click();
		Thread.sleep(2000);
		

	}

}
