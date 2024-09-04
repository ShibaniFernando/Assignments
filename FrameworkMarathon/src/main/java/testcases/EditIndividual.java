package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.CommonCodes;
import pages.LoginPage;

public class EditIndividual extends CommonCodes{
	
	@BeforeTest
	public void setValues() {
		filename="CreateIndividual";

	}
	@Test(dataProvider="provideData")
public void editTestCase(String username,String password,String name) throws Exception {
	

	LoginPage login=new LoginPage(driver);
	login.enterUsername(username)
	.enterPassword(password)
	.clickLogin()
	.clickToggleButton()
	.clickViewAll()
	.clickIndividuals()
	.searchIndividual()
	.clickEdit()
	.editTitle()
	.editName()
	.clickSaveEdit()
	.VerifyEdit();
}
}
