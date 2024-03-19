package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.RegistrationPage;

public class RegistrationPageTest extends TestBase {

	RegistrationPage registration;
	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		initialization();
		registration=new RegistrationPage();
	}
	
	@Test(priority = 1)
	public void verifyURLofPageTest() {
		String expURL="https://bideal24.com/Account/Register";
		String actURL=registration.verifyURLofPage();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("URL of Registration Page"+actURL);
	}
	
	@Test(priority = 2)
	public void verifyCongratulationMessageTest() throws InterruptedException {
		String expmsg="Congratulations!";
		String actmsg=registration.verifyCongratulationMessage();
		Assert.assertEquals(expmsg, actmsg);
		Reporter.log("Congratualations Message "+actmsg);
	}
	@Test(priority = 3)
	public void verifyLoginPageURLTest() {
		String expURL="https://bideal24.com/";
		String actURL=registration.verifyLoginPageURL();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("URL of Login Page"+actURL);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
