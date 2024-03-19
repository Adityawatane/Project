package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	LoginPage login;
	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		initialization();
		
		login=new LoginPage();
		
	}
	@Test()
	public void verifyDashboardPageURL() {
		String expURl="https://bideal24.com/Dashboard/Index";
		String actURl=login.verifyDashboardPageURL();
		Assert.assertEquals(expURl, actURl);
	}
	@Test
	public void verifyForgetURLTest() {
		String expURL="https://bideal24.com/Account/ForgotPassword";
		String actURL=login.verifyForgetURL();
		Assert.assertEquals(expURL, actURL);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
