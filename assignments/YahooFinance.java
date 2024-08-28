package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooFinance {

	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		d.get("https://finance.yahoo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//clicking Market 
		Actions a=new Actions(d);
		WebElement markets = d.findElement(By.xpath("//span[text()='Markets']"));
		a.moveToElement(markets).perform();
		a.pause(30);
		
		//Clicking crypto
		WebElement crypto = d.findElement(By.xpath("(//div[text()='Crypto'])[2]"));
		a.moveToElement(crypto).click().perform();
		
		//Getting the rows count
		List<WebElement> rows = d.findElements(By.xpath("//table/tbody/tr"));
		int rowCount=rows.size();
		System.out.println(rowCount);
		
		//Getting the list of currency names
		
		
		for (int i=0;i<rowCount;i++) {
			List<WebElement> currency = d.findElements(By.xpath("//table/tbody/tr/td[1]"));
			String name=currency.get(i).getText();
			System.out.println(name);
			
		}
	
		

	}

}
