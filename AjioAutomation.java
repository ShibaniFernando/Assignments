package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
		
		//printing the items found 
		String price = d.findElement(By.xpath("(//ul[@class='rilrtl-list '])[3]/li[3]/div//label")).getText();
		System.out.println(price);
		
		//Getting brand names 
		System.out.println("The listed brand names are:");
		List<WebElement> brandsList = d.findElements(By.xpath("//a[@class='rilrtl-products-list__link desktop']//div[@class='brand']"));
		System.out.println("The number of brands are:"+brandsList.size());
		for(int i=0;i<brandsList.size();i++) {
			System.out.println(brandsList.get(i).getText());
		}
		//Printing bag names
		System.out.println("The bag names are:");
		List<WebElement> names = d.findElements(By.xpath("//div[@class='nameCls']"));
		for (int i=0;i<names.size();i++) {
			System.out.println(names.get(i).getText());
		}
	}

}
