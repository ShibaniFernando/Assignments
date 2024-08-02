package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();

		d.findElement(By.id("username")).sendKeys("Demosalesmanager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.linkText("CRM/SFA")).click();
		d.findElement(By.linkText("Leads")).click();
		d.findElement(By.linkText("Create Lead")).click();
		d.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing");
		d.findElement(By.id("createLeadForm_firstName")).sendKeys("Shibani");
		d.findElement(By.id("createLeadForm_lastName")).sendKeys("Fernando");
		WebElement source = d.findElement(By.id("createLeadForm_dataSourceId"));
		Select s= new Select(source);
		s.selectByIndex(4);
		
		WebElement marketing = d.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select m = new Select(marketing);
		m.selectByVisibleText("Automobile");
		
		WebElement corporation = d.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select c = new Select(corporation);
		c.selectByValue("OWN_CCORP");
		
		d.findElement(By.className("smallSubmit")).click();
		String title = d.getTitle();
		System.out.println(title);
		d.close();
		
	
				
				
		

	}

}
