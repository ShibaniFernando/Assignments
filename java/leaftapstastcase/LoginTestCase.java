package leaftapstastcase;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import salesforcetestcase.ProjectSpecific;

public class LoginTestCase extends ProjectSpecific{
	@Parameters({"username","password"})
	@Test
	public void loginApp(String username,String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
	}

}
