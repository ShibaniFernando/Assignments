package salesforcetestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.github.javafaker.Faker;

public class BaseSalesForce {

	public static ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String username,String password) throws Exception {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
	}

	@DataProvider
	public String[] readNames() {
		String name[]= new String[3];
		for (int i=0;i<3;i++) {
			Faker fake= new Faker();
			String firstName = fake.name().firstName();
			name[i]=firstName;
			
		}
		return name;
		
		
	}
	@AfterMethod
	public void postCondition() {
	//	driver.close();

	}
}
