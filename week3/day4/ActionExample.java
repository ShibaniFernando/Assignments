package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ActionExample {

	public static void main(String[] args) throws IOException {
		//launching browser
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Entering details for search

		d.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		d.findElement(By.id("nav-search-submit-button")).click();
		
		//printing the price of the first search item
		
		String price = d.findElement(By.xpath("//div[@class='a-row a-size-base a-color-base']//span")).getText();
		System.out.println(price);
		
		//printing the customer rating of the first product
		
	//	String customerRating = d.findElement(By.xpath("//span[@class='a-icon-alt']")).getText();
	//	System.out.println(customerRating);
		
		//Clicking the text link
		d.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a")).click();
		
		//Taking screenshot of the page
		
		File f= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("/Users/shibanimorais/Documents/sample.png"));
		
		//moving to the child window handle
		Set<String> windowHandles = d.getWindowHandles();
		System.out.println(windowHandles);
		List<String> windowList = new ArrayList<String>(windowHandles);
		d.switchTo().window(windowList.get(1));
		
		//Adding the product to cart
		d.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
		//Getting the cart total
	//	String totalPrice = d.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
	//	System.out.println(totalPrice);
		
		
		
		
		
		
		
	}

}
