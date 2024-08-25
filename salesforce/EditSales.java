package salesforce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditSales extends BaseClassforSalesForce {
	
	@Test
	public void editSales() throws Exception {
		// Searching the opportunities
		WebElement search = d.findElement(By.xpath("//button[@type='button' and text()='Search...']"));
		search.sendKeys("Salesforce Automation by Shibani", Keys.ENTER);

		// selecting the down arrow in table
		d.findElement(By.xpath("//div[@class='uiVirtualDataTable indicator']/following::table/tbody/tr[1]/td[7]"))
				.click();

		// selecting edit option
		WebElement edit = d.findElement(
				By.xpath("//div[@role='menu' and @class='branding-actions actionMenu']/ul/li//div[@title='Edit']"));
		d.executeScript("arguments[0].click()", edit);

		// change date
		WebElement date = d.findElement(By.xpath("//input[@class='slds-input' and @name='CloseDate']"));
		date.clear();
		date.sendKeys("26/08/2024");

		// clicking stages
		d.findElement(By.xpath("//button[@aria-label='Stage']")).click();

		// selecting Perception analysis
		WebElement perception = d.findElement(By.xpath("//span[@title='Perception Analysis']/parent::span"));
		d.executeScript("arguments[0].click()", perception);
		Thread.sleep(2000);

		// selecting delivery status
		WebElement delievryButton = d.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status']"));
		d.executeScript("arguments[0].click()", delievryButton);
		
		//selecting delivery in progress
		WebElement inProgress = d.findElement(By.xpath("//span[text()='In progress']/parent::span[@class='slds-media__body']"));
		d.executeScript("arguments[0].click()", inProgress);
		
		//Entering description
		d.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforce");
		
		//Save 
		d.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		//verifying the stage
		//Getting row count
		List<WebElement> rows = d.findElements(By.xpath("//div[@class='uiVirtualDataTable indicator']/following::table/tbody/tr"));
		//Row count
		int rowCount=rows.size();
		System.out.println(rowCount);
		//Getting stage details
		String stageData = d.findElement(By.xpath("//div[@class='uiVirtualDataTable indicator']/following::table/tbody/tr[1]/td[4]/span")).getText();
		System.out.println("The Stage entry is:"+ stageData);
		//Validating
		if(stageData.contains("Analysis")) {
			System.out.println("Yes edited correctly");
		}
	}

	}


