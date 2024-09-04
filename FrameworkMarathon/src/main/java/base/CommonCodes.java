package base;

//import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcelPOM;

public class CommonCodes {

	public ChromeDriver driver;
	public String filename;
	
	@DataProvider
	public String[][] provideData() throws Exception {
		return ReadExcelPOM.readData(filename);

	}

	@BeforeMethod
	public void preCondition() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		driver = new ChromeDriver(option);

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
