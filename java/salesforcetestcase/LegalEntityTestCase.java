package salesforcetestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LegalEntityTestCase extends BaseSalesForce {

	@Test(dataProvider="readNames")
	public void createLegal(String name) throws Exception {
		// toggle button
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		// clicking view all
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//clicking legal entity
		WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		driver.executeScript("arguments[0].click()", legal);
		//clicking new
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//enter name
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		//enter company name
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("IBM");
		//enter description
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Static parameterization trial");
		//enter status
		WebElement downArrow = driver.findElement(By.xpath("//button[@aria-label='Status']"));
		driver.executeScript("arguments[0].click()", downArrow);
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		//click save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		//verify legal account creation
		String verifyname = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(verifyname);
	}
}
