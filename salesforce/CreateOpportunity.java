package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateOpportunity extends BaseClassforSalesForce{
			@Test(dataProvider="Input")
			public void createLead(String details,String amount,String date) throws Exception {
			//clicking New
			d.findElement(By.xpath("//div[@title='New']")).click();
			
			//entering opportunities name
			d.findElement(By.xpath("//input[@name='Name']")).sendKeys(details);
			
			//entering amount
			d.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
			
			//entering date
			d.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(date);
			
			//clicking stages
			d.findElement(By.xpath("//button[@aria-label='Stage']")).click();

			
			//selecting Need analysis
			WebElement needAnalysis = d.findElement(By.xpath("//span[text()='Needs Analysis']/parent::span[@class='slds-media__body']"));
			d.executeScript("arguments[0].click()", needAnalysis);
			Thread.sleep(2000);
			
			//selecting save
			WebElement save = d.findElement(By.xpath("//button[@name='SaveEdit']"));
			d.executeScript("arguments[0].click()", save);
			
			String text = d.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
			System.out.println(text);
			if (text.contains("Shibani")) {
				System.out.println("Salesforce created successfully");
			}

}
}
