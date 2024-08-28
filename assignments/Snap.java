package assignments;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snap {


		public static void main(String[] args) throws IOException, Exception {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver d = new ChromeDriver(options);
			
			d.get("https://www.snapdeal.com/");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Click mens fashion
			d.findElement(By.xpath("//ul[@class='nav smallNav']/li")).click();
			Actions act= new Actions(d);
			
			//Sports shoes
			WebElement sports = d.findElement(By.xpath("//span[text()='Sports Shoes']"));
			act.moveToElement(sports).click().perform();

			//getting the price
			List<WebElement> prices = d.findElements(By.xpath("(//li[@class='child-cat-list cat-list '])[1]/a/div"));
			for(int i=0;i<prices.size();i++) {
				System.out.println(prices.get(i).getText());
			}
	}

}
