package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableData {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://leafground.com/table.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Locate the table
		WebElement table = d.findElement(By.xpath("//thead[@id='form:j_idt89_head']"));
		// Retrieve a particular row the thead values

		List<WebElement> headerDetails = table.findElements(By.xpath("//thead[@id='form:j_idt89_head']/following::th"));
		;
		for (int i = 0; i < headerDetails.size(); i++) {
			String enteries = headerDetails.get(i).getText();
			System.out.println("The header details:" + enteries);
		}
		
		//Retrieve the 2nd row 3rd column detail
		
		WebElement specificEntry = table.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']//tr[2]/td[3]"));
		String text = specificEntry.getText();
		System.out.println("The specific 2nd row 3rd column detail is:"+ text);
		
		//Retrieve the 3th column details
		
		List<WebElement> column3elements = table.findElements(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']/tr/td[3]"));
	
		List<String> column3data= new ArrayList<String>();
		for(int i=0;i<column3elements.size();i++) {
			String a= column3elements.get(i).getText();
			column3data.add(a);
		}
		System.out.println("The elements in 3rd column:");
		for (String string : column3data) {
			System.out.println(string);
		}
		
		
	}

}
