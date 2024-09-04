package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonCodes;

public class VerifyNewCreation extends CommonCodes {
	public VerifyNewCreation(ChromeDriver driver) {
		this.driver = driver;
	}

	public void verifyNewIndividual() {

		String message = driver
				.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"))
				.getText();
		// verify Individuals Name
		System.out.println(message);
	}
}
