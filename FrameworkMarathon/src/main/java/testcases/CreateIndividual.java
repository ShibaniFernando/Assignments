package testcases;

import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.CommonCodes;
import pages.LoginPage;

public class CreateIndividual extends CommonCodes {
	@BeforeTest
	public void setValues() {
		filename="CreateIndividual";

	}
	
	@Test(dataProvider="provideData")
	public void CreateTest(String username,String password,String name) throws Exception {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickToggleButton()
		.clickViewAll()
		.clickIndividuals()
		.clickNew()
		.enterName(name)
		.clickSave()
		.verifyNewIndividual();

	
		
	}

}
