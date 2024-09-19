package demoqa;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utility.ReadExcel;

public class DemoQABase {
	public static ChromeDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void preCondition() {
	
	options= new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver=new ChromeDriver(options);
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	

	}
	@DataProvider(name="Data")
	public void giveData() throws Exception {
		ReadExcel.readData();

	}
	
	@AfterMethod
	public void postCondition() {
	
		//driver.close();
	}
	
}
