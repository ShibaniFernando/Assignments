package salesforce;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClassforSalesForce {
	public static ChromeDriver d;
	public static ChromeOptions options;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String username,String password) throws Exception {
		options= new ChromeOptions();
		d = new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//enter username
		d.findElement(By.id("username")).sendKeys(username);
		
		//enter password
		d.findElement(By.id("password")).sendKeys(password);
		
		//click login
		d.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		
		//clicking toggle
		d.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		
		//clicking view all
		d.findElement(By.xpath("//button[text()='View All']")).click();
		
		//select sales
		d.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(4000);
		
		//Clicking opportunities
		WebElement opportunities = d.findElement(By.xpath("//a[@title='Opportunities']"));
		d.executeScript("arguments[0].click()", opportunities);
		
		
}
	@AfterMethod
	public void postCondition() {
		d.close();
	}

	@DataProvider(name = "Input")
	public String[][] sendData() throws IOException {
		return ReadFile.readData();
	}
}