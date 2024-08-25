package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class DeleteSales extends BaseClassforSalesForce {
	public void deleteSales() {
	// Searching the opportunities
			WebElement search = d.findElement(By.xpath("//button[@type='button' and text()='Search...']"));
			search.sendKeys("Salesforce Automation by Shibani", Keys.ENTER);

			// selecting the down arrow in table
			d.findElement(By.xpath("//div[@class='uiVirtualDataTable indicator']/following::table/tbody/tr[1]/td[7]"))
					.click();

			// Selecting delete
			WebElement delete = d.findElement(
					By.xpath("//div[@role='menu' and @class='branding-actions actionMenu']/ul/li//div[@title='Delete']"));
			d.executeScript("arguments[0].click()", delete);
			
			//clicking delete
			d.findElement(By.xpath("//span[@dir='ltr' and text()='Delete']")).click();


}
}
