package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAmazon {

	public static void main(String[] args) throws Exception {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		Thread.sleep(2000);
		d.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();

		
		String details = d.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"))
				.getText();
		System.out.println(details);
		d.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']")).click();
		d.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[2]")).click();
		d.findElement(By.xpath("//span[@data-csa-c-func-deps='aui-da-a-dropdown-button']")).click();
		d.findElement(By.xpath(("(//ul[@role='listbox']/li)[5]"))).click();
		String firstSearchDetails = d.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).getText();
		System.out.println(firstSearchDetails);
		String prize=d.findElement(By.xpath(("//span[@class='a-offscreen']"))).getText();
		System.out.println(prize);
		System.out.println(d.getTitle());
		d.quit();
	}
	
	

}