//Comment added to do some demo changes to this file
package com.qount.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.ITestListener;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import com.qount.qa.base.TestBaseSetup;
import com.qount.qa.pages.LoginPage;
import com.qount.qa.utils.Utilities;


@Listeners(com.qount.qa.listeners.MyListeners.class)
public class LoginTest extends TestBaseSetup implements ITestListener {

	LoginPage loginPage;
	
	@BeforeClass
	public void Setup() {
		loginPage = new LoginPage(driver);
	}

	@Test//(priority=1,dataProvider="InvalidCredentialsSupplier",description = "Verify Login With inValid Credentials")
	public void verifyLoginWithInValidCredentials() throws InterruptedException, IOException {
		loginPage.login();
		AssertJUnit.assertEquals(loginPage.verifyErrorMessage(),"Username or Password incorrect");	
	}
	
	@DataProvider(name="InvalidCredentialsSupplier")
	public Object[][] supplyInvalidTestData() {
		Object[][] data = Utilities.getTestDataFromExcel("Login-Invalid");
		return data;
	}
		
	@Test//(priority = 2)//,description = "Verify Login With Valid Credentials")
	public void verifyLoginWithValidCredentials() throws InterruptedException, IOException {	
	loginPage.login();
		//	loginPage.loginWithValidCredentials(prop.getProperty("validEmail"), prop.getProperty("validPassword"));
//		AssertJUnit.assertTrue(loginPage.verifyHomePage(), "Not logged into QOUNT");		
	}
	
	@Test//(priority = 3,description = "Verify Logout")
	public void verifyLogout() {
		loginPage.logout();
	}
}
