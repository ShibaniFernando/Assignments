package week2.day1;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowserExample {

	public static void main(String[] args) {
		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.get("https://www.facebook.com/"); driver.manage().window().maximize();
		 * driver.close();
		 */

		/*
		 * SafariDriver d = new SafariDriver(); d.get("https://www.facebook.com/");
		 * d.manage().window().maximize(); d.close();
		 */

		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("https://www.facebook.com/");
		d1.manage().window().maximize();
		d1.close();

	}

}
