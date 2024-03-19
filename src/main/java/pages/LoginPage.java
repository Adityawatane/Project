package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase
{

	@FindBy(xpath="//input[@name='email']")private WebElement email;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement Signinbtn;
	@FindBy(xpath="//a[text()='Forgot Password?']")private WebElement forgetbtn;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyDashboardPageURL() {
		email.sendKeys("abc@gmail.com");
		password.sendKeys("xyzabc");
		Signinbtn.click();
		return driver.getCurrentUrl();
	}
	
	public String verifyForgetURL() {
		forgetbtn.click();
		return driver.getCurrentUrl();
	}
}
