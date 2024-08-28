package assignments;

import java.io.File;
//import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BigBasketPage {

	public static void main(String[] args) throws Exception {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver d= new ChromeDriver(options);
	d.get("https://www.bigbasket.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//clicking shop by category
	WebElement category = d.findElement(By.xpath("(//span[text()='Shop by'])[2]"));
	Actions act=new Actions(d);
	act.moveToElement(category).click().perform();
	act.pause(50);
	
	//Selecting Food grains
	WebElement food = d.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
	act.moveToElement(food).perform();
	act.pause(50);
	
	//Selecting rice
	WebElement rice = d.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
	act.moveToElement(rice).perform();
	act.pause(50);
	
	//selecting boiled rice
	WebElement boiled = d.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
	act.moveToElement(boiled).click().perform();
	
	//selecting BBRoyal
	WebElement royal = d.findElement(By.xpath("//label[text()='BB Royal']/preceding-sibling::input"));
	d.executeScript("arguments[0].click()",royal);
	
	
	//selecting tamil ponni rice
	d.findElement(By.xpath("//img[@title='bb Royal Tamil Ponni Boiled Rice 26 kg Bag']")).click();
	
	//getting all the windows address
	Set<String> windows = d.getWindowHandles();
	System.out.println("All opened window address:"+ windows);
	
	//getting the current window address
	String currentWindow = d.getWindowHandle();
	System.out.println(currentWindow);
	
	//moving focus to child window 
	List<String> windowList = new ArrayList<String>(windows);
	d.switchTo().window(windowList.get(1));
	
	//checking the window title to check 
	String title = d.getTitle();
	System.out.println(title);
	
	//Selecting 5kg
	WebElement fivekg = d.findElement(By.xpath("//span[text()='5 kg']/parent::div"));
	act.moveToElement(fivekg).click().perform();
	
	//Getting the price details 
	String price = d.findElement(By.xpath("//table/tr[1]/td[1]")).getText();
	System.out.println(price);
	
	//Adding to cart 
	d.findElement(By.xpath("//button[text()='Add to basket']")).click();
	
	//verifying success msg of adding cart
	
	//taking screenshot
	File source=d.getScreenshotAs(OutputType.FILE);
	File destination = new File("/Users/shibanimorais/Desktop/screenshots/sample.png");
	FileUtils.copyFile(source, destination);
		
	//closing window
	d.quit();


}
}
