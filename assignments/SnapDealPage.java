package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDealPage {

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
		
		//Get the count of shoes
		String count = d.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The number of searched shoes:"+ count );
		
		//clicking training shoes
		d.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//clicking the drop down
		d.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		
		//clicking low to high
		d.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		Thread.sleep(2000);
		
		//printing the price
		System.out.println("The list of prices of the training shoes");
		List<WebElement> shoeslist = d.findElements(By.xpath("//span[@class='lfloat product-price']"));
		for(int i=0;i<shoeslist.size();i++) {
			System.out.println(shoeslist.get(i).getText());
		}
		
		//changing price range
		//start range
		d.findElement(By.xpath("//input[@name='fromVal']")).clear();
		d.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		//ending range
		d.findElement(By.xpath("//input[@name='toVal']")).clear();
		d.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
		//clicking go
		d.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
	
		//scrolling page down
		JavascriptExecutor js =(JavascriptExecutor)d;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,700)");
		
	
		//clicking check box 
		WebElement colour = d.findElement(By.xpath("//a[text()=' White & Blue']"));
		d.executeScript("arguments[0].click()",colour);
		
		//getting the filters list
		System.out.println("The selected filters are:");
		Thread.sleep(3000);
		List<WebElement> filters = d.findElements(By.xpath("//div[@class='filters-top-selected']//div[@class='navFiltersPill']"));
		for(int i=0;i<filters.size();i++) {
			System.out.println(filters.get(i).getText());
		}
		Thread.sleep(3000);
		//mouse over first element
		WebElement firstOne = d.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.moveToElement(firstOne).perform();
		
		//clicking quick view
		d.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
		
		//getting the price
		System.out.println("Getting the price and discount details:");
		List<WebElement> priceAmount = d.findElements(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span"));
		for(int i=0;i<priceAmount.size();i++) {
		System.out.println(priceAmount.get(i).getText());
	}
		
		//getting screenshot
		File f=d.getScreenshotAs(OutputType.FILE);
		File destination=new File("/Users/shibanimorais/Desktop/screenshots/snapdealpic.png");
		FileUtils.copyFile(f, destination);
		
		//close current window
		d.quit();
		

		
		
		

}
}
