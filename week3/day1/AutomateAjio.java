package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAjio {

	public static void main(String[] args) throws Exception {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.ajio.com/");
		d.manage().window().maximize();

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.findElement(By.name("searchVal")).sendKeys("Bags");
		d.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		d.findElement(By.xpath("(//div[@class='facet-linkfref '])[2]")).click();
		d.findElement(By.xpath("((//ul[@class='rilrtl-list '])[3]/li)[2]")).click();
		String itemsFound = d.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(itemsFound);
		List<WebElement> elements = d
				.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']//div[@class='brand']"));
		int size = elements.size();

		List<String> details = new ArrayList<String>();

		for (int i = 0; i < size; i++) {
			String text = elements.get(i).getText();
			details.add(text);
		}
		System.out.println("Brands entries list count:" + size);
		System.out.println("List of Brands are:" + details);
		List<WebElement> elements2 = d
				.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']//div[@class='nameCls']"));
		int size1 = elements2.size();

		List<String> bagNames = new ArrayList<String>();
		for (int y = 0; y < size1; y++) {
			String text1 = elements2.get(y).getText();
			bagNames.add(text1);
		}
		System.out.println("The bag names count:"+ size1);
		System.out.println("The list of bag names are:" + bagNames);

		d.quit();

	}

}
