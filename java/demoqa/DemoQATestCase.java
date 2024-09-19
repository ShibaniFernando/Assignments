package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoQATestCase extends DemoQABase {
	@Test(dataProvider="Data")
	public void formregisteration(String fName,String lName,String eMail,String mobileNumber,String address) {
		// fname
		driver.findElement(By.id("firstName")).sendKeys(fName);
		// lastname
		driver.findElement(By.id("lastName")).sendKeys(lName);
		// email
		driver.findElement(By.id("userEmail")).sendKeys(eMail);
		// gender
		WebElement female = driver.findElement(By.xpath("//input[@value='Female']"));
		driver.executeScript("arguments[0].click()", female);
		// phone number
		driver.findElement(By.id("userNumber")).sendKeys(mobileNumber);
		// dob
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.clear();
		driver.findElement(By.xpath("//div[text()='13']")).click();
		// subjects
		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement subjects = driver.findElement(By.id("subjectsInput"));
	//	subjects.clear();
	//	String text = subjects.getText();
	//	System.out.println("The text available in the field:"+text);
	//	js.executeScript("arguments[0].value='Maths,Subjects';", subjects);
		Actions act= new Actions(driver);
		act.sendKeys(subjects, "Maths,Science").build().perform();
		// hobbies
		WebElement music = driver.findElement(By.xpath("//input[@value='3']"));
		driver.executeScript("arguments[0].click()", music);
		//upload file
		driver.findElement(By.id("uploadPicture")).sendKeys("/Users/shibanimorais/Desktop/Screenshot 2024-08-12 at 11.02.28 PM.png");
		// address
		driver.findElement(By.id("currentAddress")).sendKeys(address);
		// scroll page down
		js.executeScript("window.scrollBy(0,200);", " ");
		//state dropdown
	//	WebElement dropDown = driver.findElement(By.xpath("//div[@id='state']//div"));
	//	driver.executeScript("arguments[0].click()", dropDown);
		
	
		//select state
		driver.findElement(By.xpath("//div[text()='Select State']")).click();
		WebElement haryana = driver.findElement(By.xpath("//div[@id='react-select-3-option-2']"));
		driver.executeScript("arguments[0].click()", haryana);
		
		//select city
		driver.findElement(By.xpath("//div[text()='Select City']")).click();
		WebElement paniput = driver.findElement(By.xpath("//div[@id='react-select-4-option-1']"));
		driver.executeScript("arguments[0].click()", paniput);
		
		//click submit
		driver.findElement(By.id("submit")).click();
	}
}
